package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_location.*

class LocationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)
        webView.settings.javaScriptEnabled = true
         val locationName = intent.getIntExtra("position",0)
        if (locationName == 0){
            webView.loadUrl("https://www.google.com/maps/place/Arafat+-+Worship+Ground/@21.3509073,39.9631419,14z/data=!4m8!1m2!2m1!1sarafat!3m4!1s0x15c2077fa173daab:0xee381000c202701f!8m2!3d21.352918!4d39.9781859");
        }else  if (locationName == 1){
            webView.loadUrl("https://www.google.com/maps/place/Mina,+Al+Mashair,+Mecca+Saudi+Arabia/@21.4152071,39.8701678,14z/data=!3m1!4b1!4m8!1m2!2m1!1smina!3m4!1s0x15c2040f36853503:0xd6a3cb46f2b797b4!8m2!3d21.4146051!4d39.894564")
        }
        else if(locationName == 2){
            webView.loadUrl("https://www.google.com/maps/place/Mecca+Saudi+Arabia/@21.4359571,39.7064606,11z/data=!3m1!4b1!4m5!3m4!1s0x15c21b4ced818775:0x98ab2469cf70c9ce!8m2!3d21.3890824!4d39.8579118")
        }else if(locationName == 3){
            webView.loadUrl("https://www.google.com/maps/place/Medina+Saudi+Arabia/@24.4714392,39.3373543,10z/data=!3m1!4b1!4m5!3m4!1s0x15bdbe5197d220d5:0x2e54514fea3b08d9!8m2!3d24.5246542!4d39.5691841")
        }

    }
}