package com.example.search.di

import com.example.search.data.source.RecipeRepoImpl
import com.example.search.domain.repo.RecipesRepo
import org.koin.dsl.module

val repoImplModule = module {
    single<RecipesRepo> {
        RecipeRepoImpl(apiService = get())
    }
}