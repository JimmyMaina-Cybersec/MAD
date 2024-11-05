package com.example.secondactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openSecondActivityButton: Button = findViewById(R.id.button_open_second)

        openSecondActivityButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 1)
        }

        val openBrowserButton: Button = findViewById(R.id.button_open_browser)
        openBrowserButton.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.example.com"))
            startActivity(browserIntent)
        }

        val openMapsButton: Button = findViewById(R.id.button_open_maps)
        openMapsButton.setOnClickListener {
            val mapUri: Uri = Uri.parse("geo:0,0?q=Eiffel+Tower,Paris")
            val mapIntent = Intent(Intent.ACTION_VIEW, mapUri).apply {
                setPackage("com.google.android.apps.maps")
            }
            startActivity(mapIntent)
        }

        val makeCallButton: Button = findViewById(R.id.button_make_call)
        makeCallButton.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:123456789")
            }
            startActivity(callIntent)
        }
        
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == RESULT_OK) {
            val result = data?.getStringExtra("RESULT_DATA")
            Toast.makeText(this, "Received: $result", Toast.LENGTH_LONG).show()
        }
    }
}
