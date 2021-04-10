package com.example.myapplication

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class HajConnectAdapter(val context: Context,val icons: IntArray,val connectnamelist:ArrayList<String>): RecyclerView.Adapter<HajConnectAdapter.ViewHolder>   ()  {
    class ViewHolder(v : View) :RecyclerView.ViewHolder(v) {

        val connecticon : ImageView = v.findViewById(R.id.connecticon)
        val connectname : TextView = v.findViewById(R.id.connectname)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.connectitems,parent,false);
        return ViewHolder(itemView) //creating viewholder to connect with recyclerview
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //to set data at particular position
        holder.connecticon.setImageResource(icons.get(position))
        holder.connectname.setText(connectnamelist.get(position))
        holder.connecticon .setOnClickListener {

            if(position==2){
                val intent = Intent(context, ChatActivity::class.java)
                context.startActivity(intent)
            }else if(position==0){
                val intent = Intent(context, ScanActivity::class.java)
                context.startActivity(intent)
            }else{
                val intent = Intent(context, ConnectActivity::class.java)
                intent.putExtra("position",position)
                context.startActivity(intent)
            }

        }

    }

    override fun getItemCount(): Int {
        return connectnamelist.size
    }


}


