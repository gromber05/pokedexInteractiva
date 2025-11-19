package com.gromber05.pokedex.model

import androidx.compose.ui.graphics.Color
enum class PokemonType(val displayName: String, val color: Color) {
    FIRE("FUEGO", Color(0xFFFFA726)),
    WATER("AGUA", Color(0xFF42A5F5)),
    GRASS("PLANTA", Color(0xFF66BB6A)),
    ELECTRIC("ELÉCTRICO", Color(0xFFFFEE58)),
    NORMAL("NORMAL", Color(0xFFBDBDBD)),
    PSYCHIC("PSÍQUICO", Color(0xFFEC407A)),
    FIGHTING("LUCHA", Color(0xFFEF5350)),
    GHOST("FANTASMA", Color(0xFF7E57C2)),
    POISON("VENENO", Color(0xFFD010D7))
}