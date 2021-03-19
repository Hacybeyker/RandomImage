package com.hacybeyker.randomimage.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.hacybeyker.randomimage.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Carlos Osorio on 19/03/2021
 */

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {

    fun getSearchResults(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 20,
                maxSize = 100,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                UnsplashPagingSource(unsplashApi, query)
            }
        ).liveData


}