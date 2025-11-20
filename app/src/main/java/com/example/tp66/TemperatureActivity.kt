package com.example.tp66

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
class TemperatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_temperature)
        val btn1=findViewById<Button>(R.id.button5)
        val btn2=findViewById<Button>(R.id.button6)
        val btn3=findViewById<Button>(R.id.button8)

        var m=findViewById<EditText>(R.id.editTextText2)
        var res=findViewById<TextView>(R.id.textView2)
        var x=0.0
        btn1.setOnClickListener {
            val input = m.text.toString()

            if (input.isEmpty()) {
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            } else {
                val value = input.toDouble()
                val result = (9/7)*value +32
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
                val result = (5/9)*(value -32)
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