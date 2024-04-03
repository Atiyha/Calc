package com.example.calc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMultiply : Button
    lateinit var btnDivision :Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTV : TextView
    lateinit var btnSquare : Button






    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btn_Add)
        btnSub = findViewById(R.id.btn_Subtraction)
        btnMultiply = findViewById(R.id.btn_Multiplication)
        btnDivision = findViewById(R.id.btn_Division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTV = findViewById(R.id.result_tv)
        btnSquare = findViewById(R.id.btn_Squared)

        btnAdd.setOnClickListener (this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener (this)
        btnDivision.setOnClickListener (this)
        btnSquare.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result =0.0

       when(v?.id){
       R.id.btn_Add->{
           result = a+3
       }

       R.id.btn_Subtraction->{
           result = a-b
       }

       R.id.btn_Multiplication->{
           result = a*b
       }

       R.id.btn_Division->{
           result = a/b
       }

       R.id.btn_Squared->{
           result = a.pow(b)
       }
       }
    resultTV.text = "Result is $result"
    }
}