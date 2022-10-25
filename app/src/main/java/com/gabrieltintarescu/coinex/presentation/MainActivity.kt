/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 */
package com.gabrieltintarescu.coinex.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gabrieltintarescu.coinex.presentation.ui.theme.CoinexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoinexTheme {
                CoinexApp()
            }
        }
    }
}

@Composable
fun CoinexApp() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoinexTheme {
        CoinexApp()
    }
}