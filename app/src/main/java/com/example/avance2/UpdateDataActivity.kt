package com.example.avance2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class UpdateDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_data) // Vincula el archivo XML

        // Vincular los elementos del layout
        val editWeight = findViewById<EditText>(R.id.edit_weight)
        val editHeight = findViewById<EditText>(R.id.edit_height)
        val editName = findViewById<EditText>(R.id.edit_name)
        val updateButton = findViewById<Button>(R.id.update_button)

        // Configurar el botón para actualizar la información
        updateButton.setOnClickListener {
            val weight = editWeight.text.toString()
            val height = editHeight.text.toString()
            val name = editName.text.toString()

            if (weight.isNotEmpty() && height.isNotEmpty() && name.isNotEmpty()) {
                // Aquí podrías manejar la actualización de los datos (e.g., guardar en la base de datos)
                Toast.makeText(this, "Datos actualizados", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
