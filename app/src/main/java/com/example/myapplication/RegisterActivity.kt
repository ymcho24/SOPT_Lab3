package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.data.RequestRegister
import com.example.myapplication.data.ResponseRegister
import com.example.myapplication.network.RequestToServer
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {

    val requestToServer = RequestToServer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_join.setOnClickListener{
            requestToServer.service.requestRegister(
                RequestRegister(
                    id = et_id1.text.toString(),
                    password = et_pwd1.text.toString(),
                    name = et_name.text.toString(),
                    email = et_email.text.toString(),
                    phone = et_number.text.toString()
                )
            ).enqueue(object :Callback<ResponseRegister>{
                override fun onFailure(call: Call<ResponseRegister>, t: Throwable) {
                    //통신 실패
                }

                override fun onResponse(
                    call: Call<ResponseRegister>,
                    response: Response<ResponseRegister>
                ) {
                    //통신 성공
                    if(response.isSuccessful){
                        if(response.body()!!.success){
                            val id = et_id1.text.toString()
                            val pass = et_pwd1.text.toString()

                            val intent = Intent(this@RegisterActivity,LoginActivity::class.java)
                            intent.putExtra("id", id)
                            intent.putExtra("pass", pass)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }
                    }
                }

            })



        }
    }
}