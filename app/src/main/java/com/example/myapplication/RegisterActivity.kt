package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_join.setOnClickListener{
            val id = et_id1.text.toString()
            val pass = et_pwd1.text.toString()

            val intent = Intent(this,LoginActivity::class.java)
            intent.putExtra("id", id)
            intent.putExtra("pass", pass)
            setResult(Activity.RESULT_OK, intent)
            finish()

        }


    }
}