package br.com.viniciuscoscia.data.db

import androidx.room.*
import br.com.viniciuscoscia.data.entities.Drink

@Dao
interface DrinksDao {
    @Query("SELECT * FROM favorite_drinks")
    suspend fun getFavoriteDrinks()

    @Insert
    fun insertFavoriteDrink(drink: Drink)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateFavoriteDrink(drink: Drink)

    @Delete
    fun deleteFavoriteDrink(drink: Drink)

    @Query("SELECT * FROM favorite_drinks WHERE idDrink = :id")
    fun loadFavoriteDrinkById(id: Long): Drink
}