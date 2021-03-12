package com.example.twedupucsims1071467hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello s1071467"

    }
}