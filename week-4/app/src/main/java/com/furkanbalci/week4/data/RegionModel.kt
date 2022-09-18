package com.furkanbalci.week4.data

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * Data class region model serializable
 * @param id The id of the region.
 * @param type The type of the region.
 * @param price The price of the region.
 * @param imageUrl The image url of the region.
 */
data class RegionModel(

    @Json(name = "img_src") val imageUrl: String,
    @Json(name = "type") val type: String,
    @Json(name = "price") val price: Int,
    @Json(name = "id") val id: Int
) : Serializable
