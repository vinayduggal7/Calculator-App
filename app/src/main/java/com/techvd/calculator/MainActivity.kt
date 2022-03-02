package com.techvd.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editText : EditText
    var number1 : Float = 0.0f
    var isPlus : Boolean =false
    var isMinus : Boolean = false
    var isDivide : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.number_edit_text)


    }


    fun operationFunction(view: View) {
        when (view.id){

            R.id.button_one -> {
                operandClicked(1)
            }
            R.id.button_two -> {
                operandClicked(2)
            }
            R.id.button_three -> {
                operandClicked(3)
            }
            R.id.button_four -> {
                operandClicked(4)
            }
            R.id.button_five -> {
                operandClicked(5)
            }
            R.id.button_six -> {
                operandClicked(6)
            }
            R.id.button_seven -> {
                operandClicked(7)
            }
            R.id.button_eight -> {
                operandClicked(8)
            }
            R.id.button_nine -> {
                operandClicked(9)
            }
            R.id.button_zero -> {
                operandClicked(0)
            }

            R.id.button_dot -> {
                val number = editText.text.toString() + "."
                editText.setText(number)
            }

            R.id.button_clear -> {
                editText.setText("")
            }
            R.id.button_addition -> {
                number1 = editText.text.toString().toFloat()
                editText.setText("")
                isPlus = true
            }
            R.id.button_subtract -> {
                number1 = editText.text.toString().toFloat()
                editText.setText("")
                isMinus = true
            }
            R.id.button_divide -> {
                number1 = editText.text.toString().toFloat()
                editText.setText ("")
                isDivide = true
            }

            R.id.button_assignment -> {
                if (isPlus) {
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 + number2
                    editText.setText(result.toString())
                    isPlus = false
                }
                else if (isMinus) {
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 - number2
                    editText.setText(result.toString())
                    isMinus = false
                }
                else if(isDivide){
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 / number2
                    editText.setText(result.toString())
                    isDivide = false
                }


            }

        }
    }

    private fun operandClicked(number3: Int){
        val number = editText.text.toString() + number3
        editText.setText(number)
    }
}


