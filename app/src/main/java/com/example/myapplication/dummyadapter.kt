package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class dummyadapter (val dummylist:ArrayList<String>,val icons: IntArray,val entrytimings : ArrayList<String>,val price : ArrayList<String>): RecyclerView.Adapter<dummyadapter.ViewHolder>() {
    class ViewHolder(v : View) :RecyclerView.ViewHolder(v){
        val tv_animal_type : TextView = v.findViewById(R.id.tv_animal_type)
        val iv_profile : ImageView = v.findViewById(R.id.iv_profile)
        val tv_timings :TextView = v.findViewById(R.id.tv_timings)
        val tv_entryfee : TextView = v.findViewById(R.id.tv_entryfee)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dummyadapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.animal_list_item,parent,false);
        return ViewHolder(itemView) //creating viewholder to connect with recyclerview
    }

    override fun onBindViewHolder(holder: dummyadapter.ViewHolder, position: Int) {
        holder.tv_animal_type.setText(dummylist.get(position))//to set data at particular position
        holder.iv_profile.setImageResource(icons.get(position))
        holder.tv_timings.setText(entrytimings.get(position))
        holder.tv_entryfee.setText(price.get(position))
    }

    override fun getItemCount(): Int {

        return dummylist.size //to get length
    }


}