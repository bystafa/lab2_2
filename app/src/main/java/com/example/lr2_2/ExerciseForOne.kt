package com.example.lr2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import kotlin.random.Random

class ExerciseForOne : AppCompatActivity() {
    var a: Double = Random.nextInt(2, 9).toDouble()
    var b: Double = 0.0
    var msg: String = "${a} * X = ?"
    var correct: Int = 0
    var incorrect: Int = 0
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_for_one)

        var tView = findViewById<TextView>(R.id.textView3)
        tView.text = msg

        var input1 = findViewById<TextInputEditText>(R.id.input)
        var input2 = findViewById<TextInputEditText>(R.id.myNumber)

        var btn = findViewById<Button>(R.id.button4)
        btn.setOnClickListener {
            if(counter < 5){
                var c = input1.text.toString().toDouble()
                b = input2.text.toString().toDouble()
                if(a * b == c)
                    correct++
                else
                    incorrect++

                a = Random.nextInt(2, 9).toDouble()

                msg = "${a} * X = ?"
                tView.text = msg
                counter++
            }else{
                msg = "Правильных ответов = ${correct}, неправильных ответов = ${incorrect}"
                tView.text = msg
            }
        }
    }
}