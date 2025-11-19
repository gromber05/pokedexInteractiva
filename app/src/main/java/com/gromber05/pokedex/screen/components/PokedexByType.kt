package com.gromber05.pokedex.screen.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.gromber05.pokedex.model.Pokemon
import com.gromber05.pokedex.model.PokemonType

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PokedexByTypeList(
    pokemonList: List<Pokemon>,
    onPokemonClick: (Pokemon) -> Unit
) {
    val grouped = pokemonList.groupBy { it.primaryType }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 8.dp)
    ) {
        grouped.forEach { (type, pokemonsOfType) ->
            stickyHeader {
                HeaderType(type = type)
            }

            items(pokemonsOfType, key = { it.id }) { pokemon ->
                PokemonItem(
                    pokemon = pokemon,
                    onClick = { onPokemonClick(pokemon) }
                )
            }
        }
    }
}

@Composable
fun HeaderType(type: PokemonType) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(type.color),
        color = Color.Transparent
    ) {
        Text(
            text = type.displayName,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp).clip(shape = RoundedCornerShape(20.dp)),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Black,
            color = Color.Black,
        )
    }
}
