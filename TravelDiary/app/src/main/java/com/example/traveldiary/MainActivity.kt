package com.example.traveldiary

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnMapPress = findViewById<Button>(R.id.btn_map)
        btnMapPress.setOnClickListener{
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        val btnNotesPress = findViewById<Button>(R.id.btn_create_note)
        btnNotesPress.setOnClickListener{
            val intent = Intent(this, Notes::class.java)
            startActivity(intent)
        }

    }
}