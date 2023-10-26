package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
//    TODO: onCreate === main() ??
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //R is res folder
        setContentView(R.layout.activity_main)
    }
}