package com.bh.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bh.hellokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val TAG = "MainActivity"
/*
        binding.btnSay.setOnClickListener{
            //binding.textSay.text = "hello Kotlin"
            Log.d(TAG, "Hello Kotlin")
        }
*/
        var myName = "Brian"
        myName = "Jerry"
        Log.d(TAG,"my name is $myName")
        val age = 19
        Log.d(TAG,"I am $age years old")
    }
}