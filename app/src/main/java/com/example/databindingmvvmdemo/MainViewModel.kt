package com.example.databindingmvvmdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var quoteLiveData = MutableLiveData("what you give is what you get...")

    fun updateQuotes() {
        quoteLiveData.value = "you will see it when you believe it..."
    }
}