package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            var sharedPreference : SharedPreferences = this.getSharedPreferences("kotlinsharedpreference", Context.MODE_PRIVATE)
            if (sharedPreference.getString("name_key","").equals("")){
                val intent = Intent(this, PreferencesActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                val intent = Intent(this, Assignment3Activity::class.java)
                startActivity(intent)
                finish()
            }

        }, 3000)
    }
}