package com.example.assignmentimad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity(
    private val dataMap: Map<String, String> = mapOf(
        "26" to "Mac Miller was known as a Musician.",
        "67" to "Leonardo Da Vinci was known as an Artist.",
        "35" to "Mozart was known as an influential composer of the classical era.",
        "41" to "Kobe Bryant was a known basketball player.",
        "87" to "Dr. Seuss was a known Author.",
        "23" to "River Phoenix was a known actor.",
        "48" to "Whitney Houston was a known singer.",
        "69" to "Alan Rickman was a known actor.",
        "37" to "Vincent Van Gogh was a known artist.",
        "63" to "Sidney Poitier was a known Director."
    )
) : AppCompatActivity() {
    private lateinit var idEditText: EditText
    private lateinit var infoTextView: TextView
    private lateinit var searchButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idEditText = findViewById(R.id.idEditText)
        infoTextView = findViewById(R.id.infoTextView)
        searchButton = findViewById(R.id.searchButton)

        searchButton.setOnClickListener {
            val id = idEditText.text.toString()
            val info = dataMap[id]
            infoTextView.text = info ?: "No information found for ID: $id"
        }
    }
}













