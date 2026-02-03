package com.example.search.di

import com.example.search.ui.screen.home.HomeScreenViewmodel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewmodelModule = module {
    viewModel { HomeScreenViewmodel(useCase = get()) }
}