package com.hacybeyker.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Photo(
    val id: String,
    val description: String?,
    val urls: Urls,
    val user: User
) : Parcelable