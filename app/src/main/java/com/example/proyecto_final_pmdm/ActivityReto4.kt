package com.example.proyecto_final_pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_reto4.*
import org.jetbrains.anko.browse

class ActivityReto4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reto4)
        button.setOnClickListener {
            browse("https://www.windows93.net/")
        }
    }
}
