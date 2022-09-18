package com.furkanbalci.week4.services

import com.furkanbalci.week4.data.RegionModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * Region service.
 */
interface RegionService {

    /**
     * Get all regions.
     * @return List of regions.
     */
    @GET("realestate")
    fun getRegionsAsync(): Call<List<RegionModel>>
}