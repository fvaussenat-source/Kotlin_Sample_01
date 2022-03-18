package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 5
        var name: String = "Bob"
        var height: Float = 1.60F

        println("${name} a ${age} et mesure ${height}")

        age = 10
        println("${name} a ${age} et mesure ${height}")
        println("$name a ${age*2} et mesure $height")


    }
}