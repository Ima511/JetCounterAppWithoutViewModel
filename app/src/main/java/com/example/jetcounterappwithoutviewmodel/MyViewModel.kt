package com.example.jetcounterappwithoutviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(){
    // This class will act as ViewModel
    // Purpose is derive the UI from ViewModel
    var count by mutableStateOf(0)

    fun increaseCounter(){
        count++
    }

}