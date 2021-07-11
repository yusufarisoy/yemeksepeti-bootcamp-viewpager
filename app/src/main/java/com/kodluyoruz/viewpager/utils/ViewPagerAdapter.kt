package com.kodluyoruz.viewpager.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kodluyoruz.viewpager.ui.onboarding.OnBoardingFragment1
import com.kodluyoruz.viewpager.ui.onboarding.OnBoardingFragment2
import com.kodluyoruz.viewpager.ui.onboarding.OnBoardingFragment3

class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> OnBoardingFragment1()
            1 -> OnBoardingFragment2()
            else -> OnBoardingFragment3()
        }
    }
}