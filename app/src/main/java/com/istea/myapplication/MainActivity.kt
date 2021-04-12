package com.istea.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.reflect.KProperty1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn_Celcius)
        val txt : TextView = findViewById(R.id.textView2)
        val grados: EditText = findViewById(R.id.editTextNumber2)
        val btn_Volver: Button = findViewById(R.id.btn_Volver)

        volverAtras(btn_Volver)
        calculoFarenheit(btn,txt, grados)
    }

   fun calculoFarenheit(btn: Button,  txt : TextView, grados: EditText ){

       btn.setOnClickListener {
           var res = grados.text.toString().toDouble() * 1.8
           res = res + 32.0
           txt.setText(res.toString())


       }
    }

    fun volverAtras(btnVolver: Button){
        btnVolver.setOnClickListener {
            val int1 = Intent(this, indexActivity::class.java)
            startActivity(int1)
        }
   }
}



