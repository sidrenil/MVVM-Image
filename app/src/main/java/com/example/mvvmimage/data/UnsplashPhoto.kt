package com.example.mvvmimage.data

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class UnsplashPhoto(
    val _id: String,
    val description: String?,
    val urls: UnsplashPhotoUrls,
    val user: UnsplashUser
): Parcelable{
    @Parcelize
    data class UnsplashPhotoUrls(
         val raw:String,
         val full:String,
         val regular:String,
         val small:String,
         val thumb:String
    ):Parcelable
    @Parcelize
    data class UnsplashUser(
        val name:String,
        val username:String
    ):Parcelable{
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"
    }
}