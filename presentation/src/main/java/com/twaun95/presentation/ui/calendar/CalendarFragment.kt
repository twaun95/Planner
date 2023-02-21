package com.twaun95.presentation.ui.calendar

import android.widget.CalendarView
import androidx.fragment.app.viewModels
import com.twaun95.presentation.R
import com.twaun95.presentation.base.BaseFragment
import com.twaun95.presentation.databinding.FragmentCalendarBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class CalendarFragment : BaseFragment<FragmentCalendarBinding, CalendarFragmentViewModel>(R.layout.fragment_calendar) {
    override val fragmentVM: CalendarFragmentViewModel by viewModels<CalendarFragmentViewModel>()

    override fun setEvent() {
        super.setEvent()
        binding.viewCalendar.setOnDateChangeListener(object : CalendarView.OnDateChangeListener{
            override fun onSelectedDayChange(p0: CalendarView, year: Int, month: Int, day: Int) {
                Timber.d("${year}년 ${month}월 ${day}일")
            }

        })
    }



    companion object {
        fun newInstance() : CalendarFragment = CalendarFragment()
    }
}