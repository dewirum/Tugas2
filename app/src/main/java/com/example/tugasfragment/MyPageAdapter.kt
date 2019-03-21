package com.example.tugasfragment
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPageAdapter {
    class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){
        // sebuah list yang menampung objek Fragment
        private val pages = listOf(
            FirstFragment(), SecondFragment(), ThirdFragment(),FourthFragment()
        )
        // menentukan fragment yang akan dibuka pada posisi tertentu
        override fun getItem(position: Int): Fragment {
            return pages[position]
        }
        override fun getCount(): Int {
            return pages.size
        }
        // judul untuk tabs
        override fun getPageTitle(position: Int): CharSequence? {
            return when(position){
                0 -> "about me"
                1 -> "wisata kendal"
                2 -> "makanan kendal"
                else -> "kota kendal"
            }
        }
    }
}