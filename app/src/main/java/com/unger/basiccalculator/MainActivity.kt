package com.unger.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.unger.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 :  Double? = null
    var number2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

   fun mySum(view : View){

       number1= binding.number1txt.text.toString().toDoubleOrNull()
       number2= binding.number2txt.text.toString().toDoubleOrNull()

       if(number1 != null && number2 != null){
           result= number1!! + number2!!
           binding.resulttxt.text = " Result: ${result}"
       }
       else{
           binding.resulttxt.text= " Please Enter Number!"
       }
   }

    fun mySub(view : View){
        number1= binding.number1txt.text.toString().toDoubleOrNull()
        number2= binding.number2txt.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result= number1!! - number2!!
            binding.resulttxt.text = " Result: ${result}"
        }
        else{
            binding.resulttxt.text= " Please Enter Number!"
        }
    }

    fun myMul(view : View) {
        number1= binding.number1txt.text.toString().toDoubleOrNull()
        number2= binding.number2txt.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result= number1!! * number2!!
            binding.resulttxt.text = " Result: ${result}"
        }
        else{
            binding.resulttxt.text= " Please Enter Number!"
        }
        }

        fun myDiv(view: View) {
            number1= binding.number1txt.text.toString().toDoubleOrNull()
            number2= binding.number2txt.text.toString().toDoubleOrNull()

            if(number1 != null && number2 != null){
                result= number1!! / number2!!
                binding.resulttxt.text = " Result: ${result}"
            }
            else{
                binding.resulttxt.text= " Please Enter Number!"
            }
        }


    }