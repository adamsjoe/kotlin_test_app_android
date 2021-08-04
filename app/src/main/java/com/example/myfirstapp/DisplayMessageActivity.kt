package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // get the intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // capture the layout's textview and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message

        }
    }
}