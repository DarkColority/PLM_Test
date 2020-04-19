package com.example.plm_test.data

import com.google.firebase.database.Exclude

data class Data (

    var nombre: String? = null,
    var apellido: String? = null,
    var tipoDocumento: String? = null,
    var documento: String? = null,
    var correo: String? = null,
    var celular: String? = null,
    var fechaNacimiento: String? = null
    //val foto: String? = null
)
