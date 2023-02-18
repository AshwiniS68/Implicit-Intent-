package com.example.day10implicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webButton= findViewById<CardView>(R.id.cardWeb)
        val cameraButton= findViewById<CardView>(R.id.cardCamera)

        webButton.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.android.com/kotlin")
            startActivity(intent)
        }

        cameraButton.setOnClickListener {
             val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}