package com.twaun95.presentation.ui.main

import com.twaun95.presentation.R
import com.twaun95.presentation.adapter.MainViewPagerAdapter
import com.twaun95.presentation.base.BaseActivity
import com.twaun95.presentation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun initView() {
        super.initView()
        initViewPager()
        initBottomNavigation()
    }

    private fun initViewPager() {
        binding.viewPager.apply {
            isUserInputEnabled = false
            adapter = MainViewPagerAdapter(this@MainActivity)
        }
    }

    private fun initBottomNavigation() {
        binding.bottomNavigation.apply {
            setOnItemSelectedListener { page ->
                when(page.itemId) {
                    R.id.calendarFragment -> binding.viewPager.setCurrentItem(MainViewPagerAdapter.PAGE_CALENDAR, false)
                    R.id.noteFragment -> binding.viewPager.setCurrentItem(MainViewPagerAdapter.PAGE_NOTE, false)
                    R.id.recordFragment -> binding.viewPager.setCurrentItem(MainViewPagerAdapter.PAGE_RECORD, false)
                    else -> {}
                }
                true
            }
        }
    }
}