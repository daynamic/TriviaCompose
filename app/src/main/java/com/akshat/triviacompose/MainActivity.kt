package com.akshat.triviacompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import com.akshat.triviacompose.screens.QuestionsViewModel
import com.akshat.triviacompose.ui.theme.TriviaComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TriviaComposeTheme {
                TriviaComposeHome()
            }
        }
    }
}

@Composable
fun TriviaComposeHome(viewModel: QuestionsViewModel = hiltViewModel()){
    Questions(viewModel)

}

@Composable
fun Questions(viewModel: QuestionsViewModel) {

    val questions = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true){
        
    }

    Log.d("DEMO", "Questions : ${questions?.size}")



}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TriviaComposeTheme {

    }
}