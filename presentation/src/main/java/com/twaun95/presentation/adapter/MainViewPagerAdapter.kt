package com.twaun95.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.twaun95.presentation.ui.calendar.CalendarFragment
import com.twaun95.presentation.ui.note.NoteFragment

class MainViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = ITEM_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CalendarFragment.newInstance()
            else -> NoteFragment.newInstance()
        }
    }

    companion object {
        const val ITEM_COUNT = 2
        const val PAGE_CALENDAR = 0
        const val PAGE_NOTE = 1
    }
}