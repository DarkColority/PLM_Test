package com.example.plm_test.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.plm_test.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chk_terms.setOnClickListener{
            if(chk_terms.isChecked){
                btn_continue.isEnabled = true
                btn_continue.isClickable = true

            }else{
                btn_continue.isEnabled = false
                btn_continue.isClickable = false
            }

        }


        btn_continue.setOnClickListener {
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        }
    }
}
