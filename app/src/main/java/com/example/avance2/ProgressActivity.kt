package com.example.avance2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ProgressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress) // Asegúrate de que el nombre coincida con tu archivo XML

        // Vincular los elementos del layout
        val weightInput = findViewById<EditText>(R.id.weight_input)
        val registerButton = findViewById<Button>(R.id.register_button)

        // Configurar el botón para registrar el peso
        registerButton.setOnClickListener {
            val weight = weightInput.text.toString()
            if (weight.isNotEmpty()) {
                // Aquí podrías manejar el peso registrado, por ejemplo, guardarlo en una base de datos
                Toast.makeText(this, "Peso registrado: $weight", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor ingrese un peso", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
