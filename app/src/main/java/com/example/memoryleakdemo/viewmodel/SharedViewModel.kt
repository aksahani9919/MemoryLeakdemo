package com.example.memoryleakdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    val userName: MutableLiveData<String> = MutableLiveData()
}