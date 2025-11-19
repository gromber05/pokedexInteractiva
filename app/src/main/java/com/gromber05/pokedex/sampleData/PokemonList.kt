package com.gromber05.pokedex.sampleData

import com.gromber05.pokedex.R
import com.gromber05.pokedex.model.Pokemon
import com.gromber05.pokedex.model.PokemonType

val samplePokemon = listOf(
    Pokemon(
        id = 1,
        name = "Bulbasaur",
        primaryType = PokemonType.GRASS,
        description = "Tiene una semilla en el lomo. Absorbe energía solar para fortalecerse.",
        imageRes = R.drawable.bulbasaur
    ),
    Pokemon(
        id = 4,
        name = "Charmander",
        primaryType = PokemonType.FIRE,
        description = "La llama de su cola indica su estado de salud y emociones.",
        imageRes = R.drawable.charmander
    ),
    Pokemon(
        id = 7,
        name = "Squirtle",
        primaryType = PokemonType.WATER,
        description = "Se esconde en su caparazón y dispara agua a presión.",
        imageRes = R.drawable.squirtle
    ),
    Pokemon(
        id = 25,
        name = "Pikachu",
        primaryType = PokemonType.ELECTRIC,
        description = "Almacena electricidad en sus mejillas. Puede causar descargas potentes.",
        imageRes = R.drawable.pikachu
    ),
    Pokemon(
        id = 39,
        name = "Jigglypuff",
        primaryType = PokemonType.NORMAL,
        description = "Su canto adormece a cualquier que lo escuche.",
        imageRes = R.drawable.jigglypuff
    ),
    Pokemon(
        id = 63,
        name = "Abra",
        primaryType = PokemonType.PSYCHIC,
        description = "Duerme la mayor parte del día. Se teletransporta si se siente amenazado.",
        imageRes = R.drawable.abra
    ),
    Pokemon(
        id = 66,
        name = "Machop",
        primaryType = PokemonType.FIGHTING,
        description = "Entrena constantemente su cuerpo para hacerse más fuerte.",
        imageRes = R.drawable.machop
    ),
    Pokemon(
        id = 92,
        name = "Gastly",
        primaryType = PokemonType.GHOST,
        description = "Está formado casi por completo de gas. Puede atravesar paredes.",
        imageRes = R.drawable.gastly
    )
)
