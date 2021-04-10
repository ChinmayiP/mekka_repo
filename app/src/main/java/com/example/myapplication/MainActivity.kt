package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var u_name = findViewById(R.id.et_user_name) as EditText;
        var p_word = findViewById(R.id.et_password) as EditText;
        var submitbutton = findViewById(R.id.login) as Button;
        submitbutton.setOnClickListener(){
            var uname = u_name.text;
            var pwd = p_word.text;
            if(uname.toString() == "Chinmayi" && pwd.toString() =="Chinmayi"){
                intent = Intent(this, home::class.java)
                startActivity(intent);
                u_name.setText("");
                p_word.setText("");
            }
            else
            {
                Toast.makeText(applicationContext,"invalid login",Toast.LENGTH_SHORT).show()
            }



        }

    }
}