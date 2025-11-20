package com.example.tp66

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn1=findViewById<Button>(R.id.button)
        val btn2=findViewById<Button>(R.id.button2)
        btn1.setOnClickListener {
            val intent1=Intent(this,TemperatureActivity::class.java)
            startActivity(intent1)
        }
        btn2.setOnClickListener{
            val intent2=Intent(this,CurrencyActivity::class.java)
            startActivity(intent2)
        }

    }
}