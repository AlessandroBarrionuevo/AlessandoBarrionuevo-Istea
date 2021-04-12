package com.istea.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class indexActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        val btn1 : Button = findViewById(R.id.btn_IrMA)
        val btn2 : Button = findViewById(R.id.btn_IrMA2)

        btn1.setOnClickListener {
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        btn2.setOnClickListener {
            var intent : Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}