package com.example.androidsecondprojectdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var email: String = intent.getStringExtra("email")
        var password:String = intent.getStringExtra("password")

        val result_email = findViewById<TextView>(R.id.email)
        val result_password = findViewById<TextView>(R.id.password)

        result_email.setText(email).toString()
        result_password.setText(password).toString()
    }
    fun goBack(view: View){
        finish()
    }
}
