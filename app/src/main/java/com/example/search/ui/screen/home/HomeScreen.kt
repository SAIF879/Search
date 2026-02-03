package com.example.search.ui.screen.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(){
    val viewmodel : HomeScreenViewmodel = koinViewModel()
    val uiState = viewmodel.uiState.collectAsState()

    when(uiState.value){
        is UiState.Error -> {

        }
        UiState.Loading -> {

        }
        is UiState.Success -> {

        }
    }

}