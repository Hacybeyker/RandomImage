package com.hacybeyker.randomimage.api

import com.hacybeyker.entities.Photo

data class BaseResponse(
    val results: List<Photo>
)