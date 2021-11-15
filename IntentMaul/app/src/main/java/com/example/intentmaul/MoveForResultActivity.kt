package com.example.intentmaul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MoveForResultActivity : AppCompatActivity() {
    var rgOS: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var btnChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        rgOS = findViewById(R.id.rg_os)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener{
            val selectOption: Int = rgOS!!.checkedRadioButtonId
            radioButton = findViewById(selectOption)

            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle()
            bundle.putString("OS", radioButton.text as String?)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}