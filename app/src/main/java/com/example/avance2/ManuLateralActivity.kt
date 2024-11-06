package com.example.avance2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MenuLateralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manu_lateral)

        // Aquí puedes agregar los listeners para los botones del menú
        val btnActualizarInformacion = findViewById<TextView>(R.id.opcion_actualizar_informacion)
        val btnHistorialProgreso = findViewById<TextView>(R.id.opcion_historial_progreso)

        btnActualizarInformacion.setOnClickListener {
            // Lógica para actualizar información
        }

        btnHistorialProgreso.setOnClickListener {
            // Lógica para ver historial de progreso
        }
    }
}