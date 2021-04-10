package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class hajLoginscreen : AppCompatActivity() {
    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button
    public val sharedPrefFile = "kotlinsharedpreference"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haj_loginscreen)

        radioGroup = findViewById(R.id.groupradio)
        button = findViewById(R.id.login)
        var u_name = findViewById(R.id.et_user_name) as EditText;
        var p_word = findViewById(R.id.et_password) as EditText;


        //editor.putString("uname_key","chinmayi.p@incture.com")
        //editor.putString("pwd_key","chinnu123")
        //editor.putString("name_key","Chinmayi prakash")
        //editor.putString("contactno_key","987654321")
        //editor.putString("emergency_key","Afraa farheen")

        //editor.apply()
        //editor.commit()
        button.setOnClickListener(View.OnClickListener {
            val uname:String = (u_name.text.toString())
            val pwd:String = p_word.text.toString()
            val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor =  sharedPreferences.edit()
            editor.putString("uname_key",uname)
            editor.apply()
            editor.commit()
           // val sharedIdValue = sharedPreferences.getString("uname_key","defaultname")
          //  val sharedNameValue = sharedPreferences.getString("pwd_key","defaultname")
            if(uname.equals("afraa@gmail.com") && pwd.equals("afraa123")){
                intent = Intent(this, HajHomescreen::class.java)
                startActivity(intent);
                u_name.setText("");
                p_word.setText("");

            }else{
                Toast.makeText(applicationContext,"invalid login",Toast.LENGTH_SHORT).show()
            }
          //  val intSelectButton: Int = radioGroup!!.checkedRadioButtonId
         //   radioButton = findViewById(intSelectButton)
        //    Toast.makeText(baseContext, radioButton.text, Toast.LENGTH_SHORT).show()
        })





    }
}