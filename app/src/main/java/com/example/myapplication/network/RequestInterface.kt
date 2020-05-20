package com.example.myapplication.network

import com.example.myapplication.data.RequestLogin
import com.example.myapplication.data.RequestRegister
import com.example.myapplication.data.ResponseLogin
import com.example.myapplication.data.ResponseRegister
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestInterface{
    @POST("/user/signin")
    fun requestLogin(@Body body : RequestLogin) : Call<ResponseLogin>

    @POST("/user/signup")
    fun requestRegister(@Body body : RequestRegister) : Call<ResponseRegister>
}