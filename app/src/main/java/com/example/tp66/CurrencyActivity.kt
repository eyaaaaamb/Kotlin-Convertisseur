package com.example.tp66

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.*




class CurrencyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_currency)
        val btn1=findViewById<Button>(R.id.button3)
        val btn2=findViewById<Button>(R.id.button4)
        val btn3=findViewById<Button>(R.id.button7)
        var m=findViewById<EditText>(R.id.editTextText)
        var res=findViewById<TextView>(R.id.textView)
        var x=0.0
        btn1.setOnClickListener {
            val input = m.text.toString()

            if (input.isEmpty()) {
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            } else {
                val value = input.toDouble()
                val result = value * 3.3
                res.text = result.toString()
                btn1.setBackgroundColor(Color.DKGRAY)
                btn2.setBackgroundColor(Color.LTGRAY)
            }
        }

        btn2.setOnClickListener {
            val input = m.text.toString()

            if (input.isEmpty()) {
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            } else {
                val value = input.toDouble()
                val result = value / 3.3
                res.text = result.toString()
                btn2.setBackgroundColor(Color.DKGRAY)
                btn1.setBackgroundColor(Color.LTGRAY)
            }
        }
        btn3.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}