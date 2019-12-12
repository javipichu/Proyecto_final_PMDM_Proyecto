package com.example.proyecto_final_pmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Propuesta1.setOnClickListener {
            startActivity(Intent(this, ActivityReto1::class.java))
        }
        Propuesta2.setOnClickListener {
            startActivity(Intent(this, ActivityReto2::class.java))
        }
        Propuesta3.setOnClickListener {
            startActivity(Intent(this, ActivityReto3::class.java))
        }
        Propuesta4.setOnClickListener {
            startActivity(Intent(this, ActivityReto4::class.java))
        }
    }
}
