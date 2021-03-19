package com.hacybeyker.randomimage.ui.gallery

import androidx.lifecycle.ViewModel
import com.hacybeyker.randomimage.repository.UnsplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Carlos Osorio on 19/03/2021
 */

@HiltViewModel
class GalleryViewModel @Inject constructor(private val repository: UnsplashRepository) :
    ViewModel() {
}