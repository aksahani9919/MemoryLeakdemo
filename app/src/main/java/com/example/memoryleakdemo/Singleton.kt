package com.example.memoryleakdemo

import android.content.Context
import android.widget.Toast

class Singleton private constructor(private val context: Context){
    companion object {
        private var instance: Singleton? = null
        fun getInstance(context: Context) = instance ?: synchronized(Singleton::class.java) {
            instance ?: Singleton(context).also {
                instance = it
            }
        }
    }

    fun display(msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}

