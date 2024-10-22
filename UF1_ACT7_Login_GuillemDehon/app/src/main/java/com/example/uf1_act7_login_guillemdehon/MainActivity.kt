package com.example.uf1_act7_login_guillemdehon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.user)
        val editText2 = findViewById<EditText>(R.id.contraseña)
        val button1 = findViewById<Button>(R.id.pimpon)

        button1.setOnClickListener{
            val enteredText1 = editText1.text.toString()
            val enteredText2 = editText2.text.toString()
            Toast.makeText(this,enteredText1,Toast.LENGTH_SHORT).show()
            Toast.makeText(this,enteredText2,Toast.LENGTH_SHORT).show()
            Log.d(enteredText1,enteredText2)
        }
    }
}
//miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau miau