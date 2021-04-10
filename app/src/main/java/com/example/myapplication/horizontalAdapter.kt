package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class horizontalAdapter(val icons: IntArray):RecyclerView.Adapter<horizontalAdapter.ViewHolder>() {
    class ViewHolder(v: View):RecyclerView.ViewHolder(v){
        val iv_profile_horizontal : ImageView = v.findViewById(R.id.iv_profile_horizontal);

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val itemview = LayoutInflater.from(parent.context).inflate(R.layout.hori_item,parent,false)
        return ViewHolder(itemview);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.iv_profile_horizontal.setImageResource(icons.get(position))
    }

    override fun getItemCount(): Int {
        return icons.size
    }
}