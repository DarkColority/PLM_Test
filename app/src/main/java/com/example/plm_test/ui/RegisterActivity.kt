package com.example.plm_test.ui


import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.plm_test.R
import com.example.plm_test.data.Data
import kotlinx.android.synthetic.main.activity_register.*
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class RegisterActivity : AppCompatActivity() {

    private lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        viewModel = ViewModelProviders.of(this).get(RegisterViewModel::class.java)

        val items = arrayOf(
            "Cédula de Ciudadanía",
            "Cédula de Extranjería",
            "Pasaporte",
            "Tarjeta de Identidad")

        documents.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)


        documents.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                tv_document.text = items[position]
            }
        }

        btn_save.setOnClickListener {

            val name = et_nombre.text.toString()
            val lastName = et_apellido.text.toString()
            val idType = tv_document.text.toString()
            val id = et_documento.text.toString()
            val email = et_correo.text.toString()
            val phone = et_celular.text.toString()
            val birth = et_fecha_nacimiento.text.toString()


            val data = Data()

            data.nombre = name
            data.apellido = lastName
            data.tipoDocumento = idType
            data.documento = id
            data.correo = email
            data.celular = phone
            data.fechaNacimiento = birth


            viewModel.addUser(data)
        }
    }




}
