package com.gromber05.pokedex.model

import androidx.compose.ui.graphics.Color
enum class PokemonType(val displayName: String, val color: Color) {
    FIRE("Fuego", Color(0xFFFFA726)),
    WATER("Agua", Color(0xFF42A5F5)),
    GRASS("Planta", Color(0xFF66BB6A)),
    ELECTRIC("Eléctrico", Color(0xFFFFEE58)),
    NORMAL("Normal", Color(0xFFBDBDBD)),
    PSYCHIC("Psíquico", Color(0xFFEC407A)),
    FIGHTING("Lucha", Color(0xFFEF5350)),
    GHOST("Fantasma", Color(0xFF7E57C2))
}