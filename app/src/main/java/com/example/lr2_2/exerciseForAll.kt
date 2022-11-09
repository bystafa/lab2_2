package com.example.lr2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import kotlin.random.Random

class exerciseForAll : AppCompatActivity() {
    var a: Double = Random.nextInt(2, 9).toDouble()
    var b: Double = Random.nextInt(2, 9).toDouble()
    var msg: String = "${a} * ${b} = ?"
    var correct: Int = 0
    var incorrect: Int = 0
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_for_all)

        var tView = findViewById<TextView>(R.id.textView2)
        tView.text = msg

        var input1 = findViewById<TextInputEditText>(R.id.input)

        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            if(counter < 5){
                var c = input1.text.toString().toDouble()
                if(a * b == c)
                    correct++
                else
                    incorrect++

                a = Random.nextInt(2, 9).toDouble()
                b = Random.nextInt(2, 9).toDouble()
                msg = "${a} * ${b} = ?"
                tView.text = msg
                counter++
            }else{
                msg = "Правильных ответов = ${correct}, неправильных ответов = ${incorrect}"
                tView.text = msg
            }
        }

    }
}