package com.example.search.di

import com.example.search.domain.usecase.RecipeUseCase
import org.koin.dsl.module

val useCaseModule = module{
    single{ RecipeUseCase(recipesRepo = get()) }
}