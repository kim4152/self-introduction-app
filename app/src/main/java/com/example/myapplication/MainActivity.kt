package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.joo).setOnClickListener {
            val intent=Intent(this,joo::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.yoo).setOnClickListener {
            val intent=Intent(this,yooho::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.jeong).setOnClickListener {
            val intent=Intent(this,jeong::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.chan).setOnClickListener {
            val intent=Intent(this,chan::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.seong).setOnClickListener {
            val intent=Intent(this,seong::class.java)
            startActivity(intent)
        }

    }
}