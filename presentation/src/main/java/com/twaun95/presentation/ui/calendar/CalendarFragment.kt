package com.twaun95.presentation.ui.calendar

import androidx.fragment.app.viewModels
import com.twaun95.presentation.R
import com.twaun95.presentation.base.BaseFragment
import com.twaun95.presentation.databinding.FragmentCalendarBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CalendarFragment : BaseFragment<FragmentCalendarBinding, CalendarFragmentViewModel>(R.layout.fragment_calendar) {
    override val fragmentVM: CalendarFragmentViewModel by viewModels<CalendarFragmentViewModel>()

    companion object {
        fun newInstance() : CalendarFragment = CalendarFragment()
    }
}