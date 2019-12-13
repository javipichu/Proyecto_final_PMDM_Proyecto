package com.example.proyecto_final_pmdm

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_reto1.*

class ActivityReto1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reto1)

        ayuda.setOnClickListener{
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET)
                != PackageManager.PERMISSION_GRANTED) {
            }
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Revoluci%C3%B3n_francesa"))
            startActivity(i)
        }

        comprobar.setOnClickListener {

            val texto1 = findViewById(R.id.texto1) as EditText
            val texto2 = findViewById(R.id.texto2) as EditText


            val texto1String = texto1.text.toString()
            val texto2String = texto2.text.toString()

            val nacimiento = "1789"
            val fallecimiento = "1799"


            if (texto1String.equals(nacimiento) && texto2String.equals(fallecimiento)){
                val colorValue = Color.GREEN
                layout.setBackgroundColor(colorValue)
                Toast.makeText(this,"Respuesta correcta!", Toast.LENGTH_SHORT).show()
            }
            else {
                val colorValue = Color.RED
                layout.setBackgroundColor(colorValue)
                Toast.makeText(this,"Ups! Respuesta incorresta", Toast.LENGTH_SHORT).show()

            }




        }


    }
}
