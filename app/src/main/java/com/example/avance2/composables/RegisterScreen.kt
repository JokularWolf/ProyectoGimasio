// RegisterScreen.kt
package com.example.avance2.composables

import com.example.avance2.R
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegisterScreen(onRegistrationComplete: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000428))
    ) {
        Image(
            painter = painterResource(id = R.drawable.gimnasio),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Registro", fontSize = 32.sp, color = Color.White)

            Spacer(modifier = Modifier.height(32.dp))

            // Campos de texto para registro
            val fields = listOf("Nombre", "Apellido", "Fecha de Nacimiento", "Correo", "Contraseña", "Confirmar Contraseña", "Número de Teléfono")
            fields.forEach { label ->
                var fieldValue by remember { mutableStateOf("") }
                BasicTextField(
                    value = fieldValue,
                    onValueChange = { fieldValue = it },
                    modifier = Modifier
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .fillMaxWidth(),
                    textStyle = TextStyle(fontSize = 18.sp, color = Color.Black),
                    visualTransformation = if (label.contains("Contraseña")) PasswordVisualTransformation() else VisualTransformation.None,
                    decorationBox = { innerTextField ->
                        if (fieldValue.isEmpty()) Text(label, color = Color.Gray)
                        innerTextField()
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Botón de registro
            Button(
                onClick = { onRegistrationComplete() }, // Acción de registro
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text("Registrarse", color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Texto para volver al login
            Text("¿Ya tienes cuenta? Inicia sesión", color = Color.White, fontSize = 16.sp, modifier = Modifier.clickable { onRegistrationComplete() })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRegisterScreen() {
    RegisterScreen(onRegistrationComplete = {})
}
