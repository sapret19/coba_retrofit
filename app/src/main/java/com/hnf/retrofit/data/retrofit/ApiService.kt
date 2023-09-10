package com.hnf.retrofit.data.retrofit

import com.hnf.retrofit.data.response.RestaurantResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id : String
    ): Call<RestaurantResponse>
}