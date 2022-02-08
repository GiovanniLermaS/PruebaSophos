package com.example.testing.view.mainactivity.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.testing.view.mainactivity.fragments.AllFragment
import com.example.testing.view.mainactivity.fragments.FavoriteFragment
import com.example.testing.viewmodel.MainActivityViewModel

class TabLayoutAdapter(
    fragmentManager: FragmentManager,
    private val totalTabs: Int,
    private val homeActivityViewModel: MainActivityViewModel
) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount() = totalTabs

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                AllFragment(homeActivityViewModel)
            }
            else -> {
                FavoriteFragment(homeActivityViewModel)
            }
        }
    }
}