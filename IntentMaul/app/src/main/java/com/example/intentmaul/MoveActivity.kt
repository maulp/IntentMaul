package com.example.intentmaul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        btnHome = findViewById(R.id.btn_home)
        btnHome.setOnClickListener(this)
    }
    override fun onClick (v:View?){
        if(v != null){
            when (v.id){
                R.id.btn_home -> run{
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}


