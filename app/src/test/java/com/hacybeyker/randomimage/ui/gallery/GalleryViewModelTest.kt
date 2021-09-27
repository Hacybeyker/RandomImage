package com.hacybeyker.randomimage.ui.gallery

import com.hacybeyker.randomimage.CoroutinesTestRule
import com.hacybeyker.randomimage.repository.UnsplashRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

/**
 * Created by Carlos Osorio on 11/05/2021
 */

@ExperimentalCoroutinesApi
class GalleryViewModelTest {

    @get:Rule
    val coroutinesTestRule = CoroutinesTestRule()

    lateinit var unsplashRepository: UnsplashRepository
    lateinit var viewModelGallery: GalleryViewModel

    @Test
    fun `Listening to movies Flow emits the list of movies from the server`() =
        coroutinesTestRule.testDispatcher.runBlockingTest {
            Assert.assertTrue(true)

            val algo = unsplashRepository.getSearchResults("cats")
            viewModelGallery.searchPhotos("cats")
        }
}