package com.hacybeyker.randomimage.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.hacybeyker.entities.Photo
import com.hacybeyker.randomimage.api.UnsplashApi
import retrofit2.HttpException
import java.io.IOException

/**
 * Created by Carlos Osorio on 19/03/2021
 */

private const val STARTING_PAGE_INDEX = 1

class UnsplashPagingSource(
    private val unsplashApi: UnsplashApi,
    private val query: String
) : PagingSource<Int, Photo>() {
    override fun getRefreshKey(state: PagingState<Int, Photo>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Photo> {
        val position = params.key ?: STARTING_PAGE_INDEX
        return try {
            val response =
                unsplashApi.searchPhotos(query = query, page = position, perPage = params.loadSize)
            val photos = response.results
            LoadResult.Page(
                data = photos,
                prevKey = if (position == STARTING_PAGE_INDEX) null else position - 1,
                nextKey = if (photos.isEmpty()) null else position + 1
            )
        } catch (ex: IOException) {
            LoadResult.Error(ex)
        } catch (ex: HttpException) {
            LoadResult.Error(ex)
        }
    }
}