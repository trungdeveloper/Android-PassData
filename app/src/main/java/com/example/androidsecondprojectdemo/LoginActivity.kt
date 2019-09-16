package com.example.androidsecondprojectdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button = findViewById<Button>(R.id.button_login)

        button.setOnClickListener{
            val text_email = findViewById<EditText>(R.id.edit_text_email).text
            val text_password = findViewById<EditText>(R.id.edit_text_password).text
            if(text_email.toString().trim() != "" && text_password.toString().trim() != ""){
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("email", text_email.toString())
                intent.putExtra("password", text_password.toString())
                startActivity(intent)
                Toast.makeText(applicationContext,"Login", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Email or password not correct!", Toast.LENGTH_SHORT).show()
            }

        }
    }

}
