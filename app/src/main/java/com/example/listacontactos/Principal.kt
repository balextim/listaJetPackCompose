package com.example.listacontactos

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.listacontactos.datos.Contacto
import com.example.listacontactos.datos.DataProvider
import com.example.listacontactos.ui.theme.ListaContactosTheme

@Composable
fun PrincipalContent(navigateToProfile:(Contacto) -> Unit ) {
    val contactos = remember {DataProvider.listaContacto}
        LazyColumn (
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ){
            items(
                items=contactos,
                itemContent={
                    ListaContactosItem (contacto= it, navigateToProfile)
                }
            )
        }
}