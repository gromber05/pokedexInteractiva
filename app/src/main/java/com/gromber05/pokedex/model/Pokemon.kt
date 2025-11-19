package com.gromber05.pokedex.model

import androidx.annotation.DrawableRes

data class Pokemon(
    val id: Int,
    val name: String,
    val primaryType: PokemonType,
    val description: String,
    @DrawableRes val imageRes: Int
)