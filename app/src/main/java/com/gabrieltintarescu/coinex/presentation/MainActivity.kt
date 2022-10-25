/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 */
package com.gabrieltintarescu.coinex.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gabrieltintarescu.coinex.presentation.coin_detail.CoinDetailScreen
import com.gabrieltintarescu.coinex.presentation.coins_list.CoinListScreen
import com.gabrieltintarescu.coinex.presentation.ui.theme.CoinexTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CoinexTheme(darkTheme = true) {
                Surface(color = MaterialTheme.colors.background) {
                    CoinexApp()
                }
            }
        }
    }
}

@Composable
fun CoinexApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.CoinListScreen.route
    ) {
        composable(
            route = Screen.CoinListScreen.route
        ) {
            CoinListScreen(
                navController
            )
        }

        composable(
            route = Screen.CoinDetailScreen.route + "/{coinId}"
        ) {
            CoinDetailScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoinexTheme {
        CoinexApp()
    }
}