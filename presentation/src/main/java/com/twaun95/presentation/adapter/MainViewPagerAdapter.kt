package com.twaun95.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.twaun95.presentation.ui.calendar.CalendarFragment
import com.twaun95.presentation.ui.note.NoteFragment
import com.twaun95.presentation.ui.record.RecordFragment

class MainViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = ITEM_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CalendarFragment.newInstance()
            1 -> NoteFragment.newInstance()
            2 -> RecordFragment.newInstance()
            else -> CalendarFragment.newInstance()
        }
    }

    companion object {
        const val ITEM_COUNT = 3
        const val PAGE_CALENDAR = 0
        const val PAGE_NOTE = 1
        const val PAGE_RECORD = 2
    }
}