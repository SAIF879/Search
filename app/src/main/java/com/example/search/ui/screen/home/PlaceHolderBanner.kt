package com.example.search.ui.screen.home

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.time.Duration.Companion.seconds


fun placeHolderBanner(listOfPlaceholders: List<String>): Flow<String> = flow {
    while (true) {
        listOfPlaceholders.forEach {
            emit(it)
            delay(2.seconds)
        }
    }
}