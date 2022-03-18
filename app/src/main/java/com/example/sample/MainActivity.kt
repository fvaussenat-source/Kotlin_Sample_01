package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

fun isOldEnough(age: Int): Boolean {
    return age >=5
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ages = Array<Int>(10) { 0 }
        val tableau = arrayOf(0, 1, 2, 3)

        println(ages[0])
        tableau[0] = 1

        println(tableau.contentToString())

        for (i in 1..10 step 2) {
            println(i)
        }

        for (i in 10 downTo 1 step 2) {
            println(i)
        }

        var age: Int = 5
        var name: String = "Bob"
        var height: Float = 1.60F

        println("${name} a ${age} et mesure ${height}")

        age = 10
        println("${name.toUpperCase()} a ${age} et mesure ${height}")
        println("""$name 
            |${age*2} 
            |et mesure $height""".trimMargin()) // Raw string

        when (age)
        {
            5 -> println("$name est trop jeune")
            in 6..10 -> println("$name peut jouer au basket")
            in 6..10  -> println("$name est admis.")
        }

        if (age < 5) {
            println("$name est trop jeune popur jouer au basket.")
        }
        if (age >= 5 && height >= 1.50F) {
            println("$name peut jouer au basket")
        } else
            {
                println("$name n'a ni l'age ni la taille pour jouer au basket")
            }
        var firstname: String? = "toto"
        firstname = null
        println(firstname?.length)

        if (isOldEnough(age)) {
            println("$name est trop jeune popur jouer au basket.")
        }
        }


    }
