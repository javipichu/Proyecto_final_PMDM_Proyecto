package com.example.proyecto_final_pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_reto3.*

class ActivityReto3 : AppCompatActivity() {


    fun sum( a: Double, b: Double): Double {
        return (a+b)
    }

    fun resta( a: Double, b: Double): Double {
        return a-b
    }

    fun multi( a: Double, b: Double): Double {
        return a*b
    }

    fun divi( a: Double, b: Double): Double {
        return a/b
    }

    fun recoger1(): Double {

        val texto1 = findViewById(R.id.editText2) as EditText
        val double1 = texto1.text.toString().toDouble()
        return double1

    }

    fun recoger2(): Double {

        val texto1 = findViewById(R.id.editText4) as EditText
        val double1 = texto1.text.toString().toDouble()
        return double1

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reto3)

        sumar.setOnClickListener {
            val double1 = recoger1()
            val double2 = recoger2()
            val resultado = sum(double1,double2)
            val textoResultado = resultado.toString()
            val textoResul = findViewById(R.id.textView) as TextView
            textoResul.setText(textoResultado)
            //Toast.makeText(this,"Sumamdo la respuesta es $textoResultado", Toast.LENGTH_SHORT).show()
        }

        restar.setOnClickListener {
            val double1 = recoger1()
            val double2 = recoger2()
            val resultado = resta(double1,double2)
            val textoResultado = resultado.toString()
            val textoResul = findViewById(R.id.textView) as TextView
            textoResul.setText(textoResultado)
            //Toast.makeText(this,"Restando la respuesta es $textoResultado", Toast.LENGTH_SHORT).show()
        }

        multiplicar.setOnClickListener {
            val double1 = recoger1()
            val double2 = recoger2()
            val resultado = multi(double1,double2)
            val textoResultado = resultado.toString()
            val textoResul = findViewById(R.id.textView) as TextView
            textoResul.setText(textoResultado)
            //Toast.makeText(this,"Multiplicando la respuesta es $textoResultado", Toast.LENGTH_SHORT).show()
        }

        dividir.setOnClickListener {
            val double1 = recoger1()
            val double2 = recoger2()
            val resultado = divi(double1,double2)
            val textoResultado = resultado.toString()
            val textoResul = findViewById(R.id.textView) as TextView
            textoResul.setText(textoResultado)
            //Toast.makeText(this,"Dividiendo la respuesta es $textoResultado", Toast.LENGTH_SHORT).show()
        }
    }
}
