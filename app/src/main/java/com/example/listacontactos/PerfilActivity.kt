package com.example.listacontactos

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.ui.semantics.SemanticsProperties.Text
import com.example.listacontactos.datos.Contacto
import com.example.listacontactos.ui.theme.ListaContactosTheme

class PerfilActivity : ComponentActivity() {

    private val contacto: Contacto by lazy{
        intent?.getSerializableExtra(CONTACTO_ID) as Contacto
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ListaContactosTheme {
                ProfileScreen(contacto = contacto)
            }
        }
    }
    companion object {
        private const val CONTACTO_ID="contacto_id"
        fun newIntent(context:Context, contacto: Contacto)=
            Intent(context, PerfilActivity::class.java).apply {
                putExtra(CONTACTO_ID, contacto)
            }
    }
}