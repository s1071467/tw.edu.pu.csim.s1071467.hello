package com.example.twedupucsims1071467hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv: TextView = findViewById<TextView>(R.id.txv)
        //txv.text = "Hello s1071467!"
        //TestMaster()
        txv.text = "Hello 吳承軒!"

    }

    fun TestMaster(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Master分支"
        //456
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "tcyangpu修改螢幕觸控"
        return true
    }


}