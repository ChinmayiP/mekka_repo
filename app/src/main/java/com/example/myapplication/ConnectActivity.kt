package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.network.connectitemAdapter
import kotlinx.android.synthetic.main.activity_assignment3.*
import kotlinx.android.synthetic.main.activity_connect.*
import kotlinx.android.synthetic.main.activity_location.*
import kotlinx.android.synthetic.main.connectitem.*

class ConnectActivity : AppCompatActivity() {
    val contactnumlist = ArrayList<String>()
    lateinit var connectitAdapter: connectitemAdapter
    lateinit var layoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)

        val locationName = intent.getIntExtra("position",0)
        if (locationName == 3){
            headings.setText("Organizers")
            contactnumlist.add("8970534324");
            contactnumlist.add("9845217703")
            contactnumlist.add("9535036773")
            contactnumlist.add("8970534324");
            contactnumlist.add("9845217703")
            contactnumlist.add("9535036773")
            contactnumlist.add("8970534324");
            contactnumlist.add("9845217703")
            contactnumlist.add("9535036773")
            contactnumlist.add("8970534324");
            contactnumlist.add("9845217703")
            contactnumlist.add("9535036773")
            connectitAdapter= connectitemAdapter(contactnumlist);//sending parameters to adapter
            layoutManager= LinearLayoutManager(this)
            rv_contact_items.layoutManager=layoutManager //connecting layout and adapter
            rv_contact_items.adapter=connectitAdapter
        }else  if (locationName == 1){
            headings.setText("Pilgrims")
            contactnumlist.add("9876543210");
            contactnumlist.add("1234567890")
            contactnumlist.add("9988776655")
            contactnumlist.add("9876543210");
            contactnumlist.add("1234567890")
            contactnumlist.add("9988776655")
            contactnumlist.add("9876543210");
            contactnumlist.add("1234567890")
            contactnumlist.add("9988776655")
            contactnumlist.add("9876543210");
            contactnumlist.add("1234567890")
            contactnumlist.add("9988776655")
            contactnumlist.add("9876543210");
            contactnumlist.add("1234567890")
            contactnumlist.add("9988776655")
            connectitAdapter= connectitemAdapter(contactnumlist);//sending parameters to adapter
            layoutManager= LinearLayoutManager(this)
            rv_contact_items.layoutManager=layoutManager //connecting layout and adapter
            rv_contact_items.adapter=connectitAdapter
        }

    }
}