package com.denbofa.Assigmentweek7

import retrofit2.http.GET

interface ItemService {
    @GET("items")
    suspend fun getAllItems(): List<ItemModel>
}