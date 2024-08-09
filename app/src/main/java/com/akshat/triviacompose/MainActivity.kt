package com.akshat.triviacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.akshat.triviacompose.screens.TriviaComposeHome
import com.akshat.triviacompose.ui.theme.TriviaComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TriviaComposeTheme {
                TriviaComposeHome()
            }
        }
    }
}






@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TriviaComposeTheme {

    }
}