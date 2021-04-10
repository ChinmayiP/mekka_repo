package com.example.myapplication

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

import kotlinx.android.synthetic.main.activity_launchscreen.*

class LaunchscreenActivity : AppCompatActivity() {
    var fragment : Fragment?=null
    var iconsColorStates: ColorStateList? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launchscreen)


// menu.findItem(R.id.navigation_profile).setIcon(R.drawable.ic_bottom_profile_white);
        iconsColorStates = ColorStateList(arrayOf(intArrayOf(-android.R.attr.state_checked), intArrayOf(android.R.attr.state_checked)), intArrayOf(
                ContextCompat.getColor(this, R.color.black),
                ContextCompat.getColor(this, R.color.bluelight)
        ))
        bv_items.setItemIconTintList(iconsColorStates)
        bv_items.setItemTextColor(iconsColorStates)
        bv_items.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        loadHomefragment()
    }
    public fun loadHomefragment(){
        fragment = HomeFragment()
        loadFragment(fragment)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.home -> {
                fragment = HomeFragment()
                item.setIcon(R.drawable.ic_baseline_home_24)

            }
            R.id.profile -> {
                fragment = ProfileFragment()
                item.setIcon(R.drawable.ic_round_person_24)
            }

        }
        loadFragment(fragment)
    }
    private fun loadFragment(fragment: Fragment?): Boolean {
        //switching fragment
        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragcontainer, fragment).addToBackStack(null)
                .commit()
            return true
        }
        return false
    }

}