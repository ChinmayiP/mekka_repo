package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_assignment3.*
import kotlinx.android.synthetic.main.activity_assignment3.rv_items
import kotlinx.android.synthetic.main.activity_dashborad.*
import java.util.*
import kotlin.collections.ArrayList

class Assignment3Activity : AppCompatActivity() {
    val detaillist = ArrayList<String>()
    val entrytimings = ArrayList<String>()
    val price = ArrayList<String>()
    var icons = intArrayOf( R.drawable.lumbini,R.drawable.cunchi,R.drawable.ulsoor,R.drawable.wonderla,R.drawable.commercialstreet)

    lateinit var detailadapter : dummyadapter

    lateinit var iconadapter : horizontalAdapter
    lateinit var layoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment3)

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
        iconadapter = horizontalAdapter(icons)
        layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager=layoutManager
        recyclerview.adapter=iconadapter
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerview.itemAnimator=DefaultItemAnimator()
        recyclerview.adapter=iconadapter

        detailadapter= dummyadapter(detaillist,icons,entrytimings,price);//sending parameters to adapter
        layoutManager=LinearLayoutManager(this)
        rv_items.layoutManager=layoutManager //connecting layout and adapter
        rv_items.adapter=detailadapter
        layoutManager.orientation = LinearLayoutManager.VERTICAL // orientation
        rv_items.itemAnimator = DefaultItemAnimator()//RecyclerView comes with these basic animations out-of-the-box using the DefaultItemAnimator class
        rv_items.adapter = detailadapter

        

    }
}