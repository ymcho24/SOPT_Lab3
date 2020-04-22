package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val et_id = findViewById<EditText>(R.id.et_id)
        val et_pwd = findViewById<EditText>(R.id.et_pwd)
        val btn_login = findViewById<Button>(R.id.btn_login)
        val tv_register = findViewById<TextView>(R.id.tv_register)

        btn_login.setOnClickListener {
            if(et_id.text.isNullOrBlank()||et_pwd.text.isNullOrBlank()){
                Toast.makeText(this,"아이디와 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
        tv_register.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivityForResult(intent, 201)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val id = data?.getStringExtra("id")
        val pass = data?.getStringExtra("pass")
        val et_id = findViewById<EditText>(R.id.et_id)
        val et_pwd = findViewById<EditText>(R.id.et_pwd)

        et_id.setText(id)
        et_pwd.setText(pass)


    }

}