package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityDashboradBinding
import kotlinx.android.synthetic.main.activity_dashborad.*

class DashboradActivity : AppCompatActivity() {
    //creating arraylist to store data to be displayed
    val detaillist = ArrayList<String>()
    val price = ArrayList<String>()
    lateinit var databinding : ActivityDashboradBinding
    //Array to hold images
    var icons = intArrayOf( R.drawable.lumbini,R.drawable.cunchi,R.drawable.ulsoor,R.drawable.wonderla,R.drawable.commercialstreet)
    lateinit var detailadapter : dummyadapter //calling adapter here , lateinit is used because, data is not there in data array, so it should be called after data is filled.
    lateinit var layoutManager: LinearLayoutManager //to place data
    val entrytimings = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding=DataBindingUtil.setContentView(this,R.layout.activity_dashborad)
        

        //val rv_items : RecyclerView = findViewById(R.id.rv_items)
       // detaillist.add("Banglore Palace");
        //detaillist.add("Bannerghatta National Park");
        //detaillist.add("Innovative Film City");

        detaillist.add("Lumbini Garden");//adding data
        entrytimings.add("11:00 AM to 7:00 PM")
        price.add("INR 50/-")
        detaillist.add("Cunchi Falls")
        entrytimings.add("9:00 AM - 6:00 PM")
        price.add("No Entry Fee, INR 30/-(Parking Fee)")
        detaillist.add("Ulsoor Lake")
        entrytimings.add("6:00 AM – 8:00 PM")
        price.add("No entry fee")
        detaillist.add("WonderLa Amusement Park")
        entrytimings.add("11:00 AM - 7:00 PM")
        price.add("INR 890/-")
        detaillist.add("Commercial Street")
        entrytimings.add("11:00 AM - 8:00 PM")
        price.add("No Entry Fee")
        detailadapter= dummyadapter(detaillist,icons,entrytimings,price);//sending parameters to adapter
        layoutManager=LinearLayoutManager(this)
        rv_items.layoutManager=layoutManager //connecting layout and adapter
        rv_items.adapter=detailadapter
        layoutManager.orientation = LinearLayoutManager.VERTICAL // orientation
        rv_items.itemAnimator = DefaultItemAnimator()//RecyclerView comes with these basic animations out-of-the-box using the DefaultItemAnimator class
        rv_items.adapter = detailadapter

    }
}