package br.com.viniciuscoscia.data.db

import androidx.room.Database
import br.com.viniciuscoscia.data.entities.Drink

@Database(entities = [Drink::class], version = 1)
abstract class DrinksDatabase {
    abstract fun getDrinksDao(): DrinksDao
}