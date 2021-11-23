package com.example.listacontactos

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.listacontactos.datos.Contacto
import com.example.listacontactos.ui.theme.ListaContactosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaContactosTheme {
                PantallaPrincipal{
                    startActivity(Intent(PerfilActivity.newIntent(this, it)))
                }
            }
        }
    }
}

@Composable
fun PantallaPrincipal(navigateToProfile:(Contacto)-> Unit) {
    Scaffold(
        content = {
            PrincipalContent(navigateToProfile = navigateToProfile)
        }
    )
}