package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputPeso = findViewById<TextInputEditText>(R.id.edtpeso)
        val inputAltura = findViewById<TextInputEditText>(R.id.edtaltura)
        val btnCalcular = findViewById<Button>(R.id.btncalcular)

        btnCalcular.setOnClickListener {

            val pesoStr: String = inputPeso.text.toString()
            val alturaStr: String = inputAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                Snackbar.make(
                    inputPeso,
                    "Preencher todos os campos",
                    Snackbar.LENGTH_SHORT
                )
                    .show()

            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val altura2 = altura * altura
                val imc = peso / altura2


                // Aqui  chama a tela de resultado
                // Intent é a intencao para onde eu quero que a tela vá
                // neste caso para tela de resultado (ResultActivity)
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, imc)
                startActivity(intent)

                println("Teste IMC: " + imc)
            }


        }

    }
}