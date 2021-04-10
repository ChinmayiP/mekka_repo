package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.myapplication.models.HeroNames
import com.example.myapplication.network.RetrofitClient
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class APIcallActivity : AppCompatActivity() {
    val heroarray = ArrayList<String>()
    lateinit var sp_heronames : Spinner
    lateinit var click_button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_p_icall)

         click_button = findViewById(R.id.click) as Button
         sp_heronames = findViewById(R.id.sp_heronames) as Spinner


        click_button.setOnClickListener() {


        }
        getHeroes()
    }

    private fun getHeroes() {
        val call = RetrofitClient.instance!!.myApi.getHeroes()
        call.enqueue(object : Callback<List<HeroNames>> {
            override fun onResponse(call: Call<List<HeroNames>>, response: Response<List<HeroNames>>) {

                val heroList = response.body()!!

                for (i in heroList.indices) {
                    heroarray.add(i, heroList.get(i).realname.toString())
                }
                Log.e("heroes", "Dataaa" + heroarray);
                val arrayAdapter = ArrayAdapter(this@APIcallActivity, android.R.layout.simple_dropdown_item_1line,heroarray)
                //  val aa = ArrayAdapter(this@LaunchActivity,android.R.layout.simple_spinner_item,list)
             sp_heronames.adapter =arrayAdapter

            }
            override fun onFailure(call: Call<List<HeroNames>>, t: Throwable) {
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
    
}