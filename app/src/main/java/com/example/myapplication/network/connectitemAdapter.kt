package com.example.myapplication.network

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.HajConnectAdapter
import com.example.myapplication.R

class connectitemAdapter( val connectnamelist:ArrayList<String>) :RecyclerView.Adapter<connectitemAdapter.ViewHolder> (){
    class ViewHolder(v:View):RecyclerView.ViewHolder(v) {
        val connectcalls : TextView = v.findViewById(R.id.connectcalls)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.connectitem,parent,false);
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.connectcalls.setText(connectnamelist.get(position))
    }

    override fun getItemCount(): Int {
        return connectnamelist.size
    }


}