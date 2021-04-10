package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity : AppCompatActivity() {
    var tabLayout: TabLayout? = null //make sure that tablout exists ..
    var viewPager: ViewPager? = null //make sure that viewpager exists ..
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        tabLayout = findViewById<TabLayout>(R.id.tabLayout) //taking reference from tablayout
        viewPager = findViewById<ViewPager>(R.id.viewPager) //taking reference from viewpager

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Home")) //adding tabs
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Profile"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Order"))
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
                    return HomeFragment()
                }
                1 -> {
                    return ProfileFragment()
                }
                2 -> {
                    return OrderFragment()
                }
                else ->  throw IllegalStateException("position $position is invalid for this viewpager")
            }
        }

        override fun getCount(): Int {
            return totalTabs
        }
    }
}