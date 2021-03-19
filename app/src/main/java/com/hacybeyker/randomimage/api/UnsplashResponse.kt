package com.hacybeyker.randomimage.api

import com.hacybeyker.entities.Photo

data class UnsplashResponse(
    val results: List<Photo>
)