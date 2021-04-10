package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class HajSplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haj_splash_screen)
        Handler().postDelayed({
            var sharedPreference : SharedPreferences = this.getSharedPreferences("kotlinsharedpreference", Context.MODE_PRIVATE)
            if (sharedPreference.getString("uname_key","").equals("")){
                val intent = Intent(this, hajLoginscreen::class.java)
                startActivity(intent)
                finish()
            }else{

                val intent = Intent(this, HajHomescreen::class.java)
                startActivity(intent)
                finish()
            }

        }, 3000)
    }
}