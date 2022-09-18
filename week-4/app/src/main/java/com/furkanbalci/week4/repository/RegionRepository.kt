package com.furkanbalci.week4.repository

import com.furkanbalci.week4.data.RegionModel
import com.furkanbalci.week4.services.RegionService
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.await
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Region Repository
 */
class RegionRepository {

    /**
     * Gets the region data from the API
     */
    suspend fun getRegions(): List<RegionModel> {

        // Create Moshi object
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        // Create Retrofit object
        val retrofit = Retrofit.Builder()
            .baseUrl("https://mars.udacity.com/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()

        // Create service
        val regionService = retrofit.create(RegionService::class.java)
        val response = regionService.getRegionsAsync()

        // Return the data
        return response.await().toList()
    }
}