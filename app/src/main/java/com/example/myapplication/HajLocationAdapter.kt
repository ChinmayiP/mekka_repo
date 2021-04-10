package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HajLocationAdapter(val context: Context, val icons: IntArray,val locationnamelist:ArrayList<String>): RecyclerView.Adapter<HajLocationAdapter.ViewHolder>   () {


    class ViewHolder(v : View) :RecyclerView.ViewHolder(v) {

        val locationicon : ImageView = v.findViewById(R.id.locationicon)
        val locationname : TextView = v.findViewById(R.id.locationname)
        val ll_items : LinearLayout = v.findViewById(R.id.ll_items)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HajLocationAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.locationitem,parent,false);
        return ViewHolder(itemView) //creating viewholder to connect with recyclerview
    }

    override fun onBindViewHolder(holder: HajLocationAdapter.ViewHolder, position: Int) {
        holder.locationicon.setImageResource(icons.get(position))
        holder.locationname.setText(locationnamelist.get(position))
        holder.ll_items.setOnClickListener {
            val intent = Intent(context, LocationActivity::class.java)
            intent.putExtra("position",position)
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return locationnamelist.size
    }


}