package com.hamidulloh.weather.model

import com.squareup.moshi.Json

data class Weather(
    @field:Json(name = "id")
    val id: Int,

    @field:Json(name = "main")
    val main: String,

    @field:Json(name = "description")
    val desc: String,

    @field:Json(name = "icon")
    val icon: String
)