package com.kodluyoruz.viewpager.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kodluyoruz.viewpager.R
import com.kodluyoruz.viewpager.ui.BaseFragment

class OnBoardingFragment1: BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_on_boarding1, container, false)
    }
}