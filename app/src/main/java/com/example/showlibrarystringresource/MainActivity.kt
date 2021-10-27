package com.example.showlibrarystringresource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resource_string = application.resources.getString(R.string.lib_str_1)
        val tv: TextView = findViewById(R.id.tv1)
        tv.text = resource_string
    }
}