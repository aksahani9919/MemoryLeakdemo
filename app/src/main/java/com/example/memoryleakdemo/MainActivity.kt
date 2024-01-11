package com.example.memoryleakdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.memoryleakdemo.viewmodel.SharedViewModel
import java.util.LinkedList

class MainActivity : AppCompatActivity() {

    private lateinit var  viewModel : SharedViewModel


    var str: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[SharedViewModel::class.java]

//        findViewById<Button>(R.id.nextButton).setOnClickListener {
//            startActivity(Intent(this, MemoryLeakActivity::class.java))
//        }

        Singleton.getInstance(this).display("Hello Hiiii")
    }
}

