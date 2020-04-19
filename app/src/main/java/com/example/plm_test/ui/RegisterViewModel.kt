package com.example.plm_test.ui

import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.plm_test.data.Data
import com.example.plm_test.data.NODE_USERS
import com.google.firebase.database.FirebaseDatabase
import kotlin.coroutines.coroutineContext

class RegisterViewModel: ViewModel() {

    fun addUser(data: Data){
        val dbUsers = FirebaseDatabase.getInstance().getReference(NODE_USERS)
        var id = dbUsers.push().key

        dbUsers.child(id!!).setValue(data)
            .addOnCompleteListener{

            }
    }
}