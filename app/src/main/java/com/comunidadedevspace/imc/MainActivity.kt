package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputPeso = findViewById<TextInputEditText>(R.id.edtpeso)
        val inputAltura = findViewById<TextInputEditText>(R.id.edtaltura)
        val btnCalcular = findViewById<Button>(R.id.btncalcular)

        btnCalcular.setOnClickListener {

            val peso: Float = inputPeso.text.toString().toFloat()
            val altura: Float = inputAltura.text.toString().toFloat()
            val altura2 = altura * altura

            val imc = peso / altura2

            println("Teste IMC: " + imc)
        }

    }
}