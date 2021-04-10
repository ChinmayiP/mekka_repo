package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class HajHomescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var tabLayout: TabLayout? = null //make sure that tablout exists ..
        var viewPager: ViewPager? = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haj_homescreen)
        tabLayout = findViewById<TabLayout>(R.id.tabLayout) //taking reference from tablayout
        viewPager = findViewById<ViewPager>(R.id.viewPager) //taking reference from viewpager

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Profile")) //adding tabs
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Location"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Connect"))

        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = MyAdapter(this, supportFragmentManager, tabLayout!!.tabCount)
        viewPager!!.adapter = adapter

        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager!!.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
        viewPager!!.setOffscreenPageLimit(3);


    }
    class MyAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {

            when (position) {
                0 -> {
                    return HajProfileFragment()
                }
                1 -> {
                    return HajLocationFragment()
                }
                2 -> {
                    return HajContactFragment()
                }

                else ->  throw IllegalStateException("position $position is invalid for this viewpager")
            }
        }

        override fun getCount(): Int {
            return totalTabs
        }
    }
}