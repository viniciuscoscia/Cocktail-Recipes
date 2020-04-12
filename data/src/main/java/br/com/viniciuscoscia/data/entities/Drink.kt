package br.com.viniciuscoscia.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

data class DrinkRequest(
    var drinks: List<Drink> = listOf()
)

@Entity(tableName = "favorite_drinks")
data class Drink(
    @PrimaryKey val idDrink: String? = null,
    var dateModified: String? = null,
    var strAlcoholic: String? = null,
    var strCategory: String? = null,
    var strCreativeCommonsConfirmed: String? = null,
    var strDrink: String? = null,
    var strDrinkAlternate: String? = null,
    var strDrinkDE: String? = null,
    var strDrinkES: String? = null,
    var strDrinkFR: String? = null,
    var strDrinkThumb: String? = null,
    var strDrinkZHHANS: String? = null,
    var strDrinkZHHANT: String? = null,
    var strGlass: String? = null,
    var strIBA: String? = null,
    var strIngredient1: String? = null,
    var strIngredient10: String? = null,
    var strIngredient11: String? = null,
    var strIngredient12: String? = null,
    var strIngredient13: String? = null,
    var strIngredient14: String? = null,
    var strIngredient15: String? = null,
    var strIngredient2: String? = null,
    var strIngredient3: String? = null,
    var strIngredient4: String? = null,
    var strIngredient5: String? = null,
    var strIngredient6: String? = null,
    var strIngredient7: String? = null,
    var strIngredient8: String? = null,
    var strIngredient9: String? = null,
    var strInstructions: String? = null,
    var strInstructionsDE: String? = null,
    var strInstructionsES: String? = null,
    var strInstructionsFR: String? = null,
    var strInstructionsZHHANS: String? = null,
    var strInstructionsZHHANT: String? = null,
    var strMeasure1: String? = null,
    var strMeasure10: String? = null,
    var strMeasure11: String? = null,
    var strMeasure12: String? = null,
    var strMeasure13: String? = null,
    var strMeasure14: String? = null,
    var strMeasure15: String? = null,
    var strMeasure2: String? = null,
    var strMeasure3: String? = null,
    var strMeasure4: String? = null,
    var strMeasure5: String? = null,
    var strMeasure6: String? = null,
    var strMeasure7: String? = null,
    var strMeasure8: String? = null,
    var strMeasure9: String? = null,
    var strTags: String? = null,
    var strVideo: String? = null
)