package com.gromber05.pokedex.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gromber05.pokedex.model.Pokemon
import com.gromber05.pokedex.model.PokemonDetailDialog
import com.gromber05.pokedex.screen.components.PokedexByTypeList
import com.gromber05.pokedex.screen.components.PokedexGrid
import com.gromber05.pokedex.screen.components.PokedexListVertical

enum class PokedexView {
    LIST, GRID, GROUPED
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokedexMainScreen(pokemonList : List<Pokemon>) {
    var currentScreen by remember { mutableStateOf(PokedexView.LIST ) }
    var selectedPokemon by remember { mutableStateOf<Pokemon?>(null) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pokédex Compose") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ){
            PokedexViewSelector(
                currentView = currentScreen,
                onViewSelected = { currentScreen = it}
            )

            Spacer(Modifier.height(8.dp))

            when (currentScreen) {
                PokedexView.LIST -> PokedexListVertical(
                    pokemonList = pokemonList,
                    onPokemonClick = { selectedPokemon = it }
                )
                PokedexView.GRID -> PokedexGrid(
                    pokemonList = pokemonList,
                    onPokemonClick = { selectedPokemon = it }
                )
                PokedexView.GROUPED -> PokedexByTypeList(
                    pokemonList = pokemonList,
                    onPokemonClick = { selectedPokemon = it }
                )
            }

            selectedPokemon?.let { pokemon ->
                PokemonDetailDialog(
                    pokemon = pokemon,
                    onDismiss = { selectedPokemon = null }
                )
            }

        }
    }
}

@Composable
fun PokedexViewSelector(
    currentView: PokedexView,
    onViewSelected: (PokedexView) -> Unit
) {
    val options = listOf(
        PokedexView.LIST to "Lista",
        PokedexView.GRID to "Cuadrícula",
        PokedexView.GROUPED to "Por tipo"
    )

    TabRow(
        selectedTabIndex = options.indexOfFirst { it.first == currentView }
    ) {
        options.forEachIndexed { index, (view, title) ->
            Tab(
                selected = currentView == view,
                onClick = { onViewSelected(view) },
                text = { Text(title) }
            )
        }
    }
}