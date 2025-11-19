package com.gromber05.pokedex.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.gromber05.pokedex.model.Pokemon

@Composable
fun PokemonCard(
    pokemon: Pokemon,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = pokemon.imageRes),
                contentDescription = "Imagen de ${pokemon.name}",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = pokemon.name,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Row(
                Modifier.padding(2.dp)
            ) {
                Text(
                    text = pokemon.primaryType.displayName,
                    style = MaterialTheme.typography.bodySmall,
                    color = pokemon.primaryType.color,
                    textAlign = TextAlign.Center
                )
                /*
                Este trozo de código lo que hace es que si el pokemon que le hemos pasado como variable
                posee dos tipos, el segundo tipo también se muestre.
                */

                if (pokemon.secondaryType != null) {
                    Spacer(Modifier.padding(2.dp))
                    Text(
                        text = pokemon.secondaryType.displayName,
                        style = MaterialTheme.typography.bodySmall,
                        color = pokemon.secondaryType.color,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
