package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.fragment_haj_contact.*


/**
 * A simple [Fragment] subclass.
 * Use the [HajContactFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HajContactFragment : Fragment() {

    var icons = intArrayOf( R.drawable.ic_baseline_qr_code_scanner_24,R.drawable.ic_baseline_emoji_people_24,R.drawable.ic_baseline_chat_24,R.drawable.ic_baseline_people_24)
    val connectnamelist = ArrayList<String>()
    lateinit var connectadapter : HajConnectAdapter
    lateinit var layoutManager: GridLayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_haj_contact, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        connectnamelist.add("Scan Pilgrim ID")
        connectnamelist.add("Pilgrims")
        connectnamelist.add("Chats")
        connectnamelist.add("Organizers")
        connectadapter= HajConnectAdapter(activity!!,icons,connectnamelist);//sending parameters to adapter
        layoutManager = GridLayoutManager(activity,2)


        rv_connect.layoutManager = layoutManager
        rv_connect.adapter=connectadapter
        layoutManager.orientation = GridLayoutManager.VERTICAL// orientation

        rv_connect.itemAnimator = DefaultItemAnimator()
        rv_connect.adapter=connectadapter
    }
}