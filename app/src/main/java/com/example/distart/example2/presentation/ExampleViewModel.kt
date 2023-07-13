package com.example.distart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.distart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
): ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this")
    }
}