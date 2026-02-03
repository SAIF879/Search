package com.example.search.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.search.domain.model.Recipe
import com.example.search.domain.usecase.RecipeUseCase
import com.example.search.domain.util.RecipeResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

sealed class UiState {
    data object Loading : UiState()
    data class Success(val recipes: List<Recipe>) : UiState()
    data class Error(val message: String) : UiState()

}

class HomeScreenViewmodel(private val useCase: RecipeUseCase) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState> = _uiState

    init {
        getAllRecipes()
    }

    private fun getAllRecipes() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            val result = useCase()
            _uiState.value = when (result) {
                is RecipeResult.Success ->
                    UiState.Success(result.data.recipes)

                is RecipeResult.Error ->
                    UiState.Error(result.message)
            }
        }
    }
}

