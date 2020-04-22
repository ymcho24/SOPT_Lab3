package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_join = findViewById<Button>(R.id.btn_join)
        val ed1 = findViewById<EditText>(R.id.et_id1)
        val ed2 = findViewById<EditText>(R.id.et_pwd1)

        btn_join.setOnClickListener{
            val id = ed1.text.toString()
            val pass = ed2.text.toString()

            val intent = Intent(this,LoginActivity::class.java)
            intent.putExtra("id", id)
            intent.putExtra("pass", pass)
            setResult(Activity.RESULT_OK, intent)
            finish()

        }


    }
}