package br.com.viniciuscoscia.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface CocktailAPI {

    @GET(BASE_API_URL + URL_SEARCH)
    suspend fun searchDrinkByName(@Query("s") drinkName: String)

    companion object {
        private const val BASE_API_URL = "https://www.thecocktaildb.com/api/json/v1/1/"
        private const val URL_SEARCH = "search.php?"
    }
}