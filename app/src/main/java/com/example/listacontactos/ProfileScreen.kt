package com.example.listacontactos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.listacontactos.datos.Contacto

@Composable
fun ProfileScreen(contacto: Contacto){
    val scrollState= rememberScrollState()
    Column(modifier=Modifier.fillMaxSize()) {
        BoxWithConstraints() {
            Surface() {
                Column (
                    modifier= Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)

                        ){
                    ProfileHeader(contacto = contacto, containerHeight = this@BoxWithConstraints.maxHeight)
                    ProfileContent(contacto = contacto, containerHeight = this@BoxWithConstraints.maxHeight)
                }
            }
        }
    }
}

@Composable
private fun ProfileHeader(
    contacto:Contacto,
    containerHeight: Dp
) {
    Image(
        modifier= Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxSize(),
        painter=painterResource(id=contacto.idImagen),
        contentScale= ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun ProfileContent (contacto:Contacto, containerHeight: Dp) {
    Column {
        Nombre(contacto = contacto)
        ProfilePropiedades(label = stringResource(id = R.string.apellido), value =contacto.apellido )
        ProfilePropiedades(label = stringResource(id = R.string.numero), value =contacto.numero.toString() )
        ProfilePropiedades(label = stringResource(id = R.string.correo), value =contacto.correo)
        ProfilePropiedades(label = stringResource(id = R.string.descripcion), value =contacto.descripcion )
    }
}

@Composable
private fun Nombre (contacto:Contacto) {
    Column(modifier=Modifier.padding(16.dp)) {
        Text(text = contacto.nombre,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold)
    }
}

@Composable
private fun ProfilePropiedades (label:String, value:String) {
    Column(modifier=Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider()
        Text(
            text = label,
            modifier=Modifier.height(16.dp),
            style = MaterialTheme.typography.caption
        )
        Text(
            text= value,
            modifier=Modifier.height(24.dp),
            style = MaterialTheme.typography.body1
        )
    }
}