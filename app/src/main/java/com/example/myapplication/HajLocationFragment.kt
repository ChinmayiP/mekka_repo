package com.example.myapplication

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_haj_location.*


/**
 * A simple [Fragment] subclass.
 * Use the [HajLocationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HajLocationFragment() : Fragment() {

    var icons = intArrayOf(R.drawable.arafat, R.drawable.mina, R.drawable.makka, R.drawable.madinah
    )
    val locationnamelist = ArrayList<String>()
    lateinit var locationAdapter: HajLocationAdapter
    lateinit var layoutManager: GridLayoutManager


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_haj_location, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        locationnamelist.add("Arafat")
        locationnamelist.add("Mina")
        locationnamelist.add("Makkah")
        locationnamelist.add("Madinah")
        locationAdapter = HajLocationAdapter(activity!!, icons, locationnamelist);//sending parameters to adapter
        layoutManager = GridLayoutManager(activity, 2)


        rv_location.layoutManager = layoutManager
        rv_location.adapter = locationAdapter
        layoutManager.orientation = GridLayoutManager.VERTICAL// orientation

        rv_location.itemAnimator = DefaultItemAnimator()
        rv_location.adapter = locationAdapter
    }



}