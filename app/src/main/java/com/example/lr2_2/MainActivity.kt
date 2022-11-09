package com.example.lr2_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn2 = findViewById<Button>(R.id.button2)
        var btn3 = findViewById<Button>(R.id.button3)

        btn2.setOnClickListener {
            val intent = Intent(this@MainActivity, exerciseForAll::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this@MainActivity, ExerciseForOne::class.java)
            startActivity(intent)
        }
    }
}