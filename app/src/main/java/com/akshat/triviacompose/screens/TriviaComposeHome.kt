package com.akshat.triviacompose.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.akshat.triviacompose.component.Questions

@Composable
fun TriviaComposeHome(viewModel: QuestionsViewModel = hiltViewModel()) {
    Questions(viewModel)
}