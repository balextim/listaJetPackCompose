package com.example.listacontactos

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.listacontactos.datos.Contacto

@Composable
fun ListaContactosItem(contacto:Contacto, navigateToProfile:(Contacto)-> Unit) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        shape = RoundedCornerShape(corner= CornerSize(16.dp))
    ) {
        Row(
            Modifier.clickable { navigateToProfile(contacto) }
        ) {
            ImagenContacto(contacto = contacto)
            Column (
                modifier= Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
                    ){
                Text(text = contacto.nombre, style = typography.h6 )
                Text(text = "Detalles", style = typography.caption)
            }

        }
    }
}

@Composable
private fun ImagenContacto(contacto:Contacto){
    Image(
        painter = painterResource(id = contacto.idImagen),
        contentDescription= null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(85.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}