package com.example.secondactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val backButton = findViewById<Button>(R.id.button_back)
        backButton.setOnClickListener {
            finish()
        }

        val returnDataButton = findViewById<Button>(R.id.button_return_data)
        returnDataButton.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("RESULT_DATA", "Some data from SecondActivity")
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}
