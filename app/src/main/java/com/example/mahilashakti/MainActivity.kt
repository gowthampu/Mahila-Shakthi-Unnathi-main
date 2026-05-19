package com.example.mahilashakti

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {

            val name = etName.text.toString()
            val phone = etPhone.text.toString()

            Toast.makeText(
                this,
                "Member Saved: $name",
                Toast.LENGTH_LONG
            ).show()

            etName.text.clear()
            etPhone.text.clear()
        }
    }
}
