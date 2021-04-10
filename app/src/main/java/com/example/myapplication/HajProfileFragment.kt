package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_haj_profile.*


/**
 * A simple [Fragment] subclass.
 * Use the [HajProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HajProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_haj_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Name.setText("Afraa Farheen")
        profileemail.setText("afraa@gmail.com")
        contactno.setText("9876543212")
        emergencycontact.setText("8970564325")


    }

}