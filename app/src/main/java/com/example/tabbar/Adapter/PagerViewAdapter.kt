package com.example.tabbar.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabbar.Fragments.*

internal class PagerViewAdapter(fm: FragmentManager?) :
    FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ListFragment()

            }
            1 -> {
                VisualFragment()
            }
            2 -> {
                CalendarFragment()
            }
            else -> VisualFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

}