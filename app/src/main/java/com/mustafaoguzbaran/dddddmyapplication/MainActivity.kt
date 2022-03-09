package com.mustafaoguzbaran.dddddmyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number1 : Int? = null
    var number2 : Int? = null
    var result: Int?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mySum(view: View) {
        var number1 = editText.text.toString().toIntOrNull()
        var number2 = editText2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            textView.text = "Error"
        }else{
            result = number1!! + number2!!
            textView.text = "Sonuç: ${result}"
        }



    }
    fun mySub(view: View) {
        var number1 = editText.text.toString().toIntOrNull()
        var number2 = editText2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            textView.text = "Error"
        }else{
            result = number1!! - number2!!
            textView.text = "Sonuç: ${result}"
        }

    }
    fun myMultiply(view: View){
        var number1 = editText.text.toString().toIntOrNull()
        var number2 = editText2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            textView.text = "Error"
        }else{
            var number1 = editText.text.toString().toIntOrNull()
            var number2 = editText2.text.toString().toIntOrNull()
            result = number1!!* number2!!
            textView.text = "Sonuç: ${result}"
        }

    }
    fun myDiv(view: View) {
        var number1 = editText.text.toString().toIntOrNull()
        var number2 = editText2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            textView.text = "Error"
        }else{
            var number1 = editText.text.toString().toIntOrNull()
            var number2 = editText2.text.toString().toIntOrNull()
            result = number1!! / number2!!
            textView.text = "Sonuç: ${result}"
        }

    }
}
