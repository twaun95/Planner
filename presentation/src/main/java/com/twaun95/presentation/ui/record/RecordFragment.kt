package com.twaun95.presentation.ui.record

import androidx.fragment.app.viewModels
import com.twaun95.presentation.R
import com.twaun95.presentation.base.BaseFragment
import com.twaun95.presentation.databinding.FragmentRecordBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecordFragment : BaseFragment<FragmentRecordBinding, RecordFragmentViewModel>(R.layout.fragment_record){
    override val fragmentVM: RecordFragmentViewModel by viewModels<RecordFragmentViewModel>()

    companion object {
        fun newInstance() : RecordFragment = RecordFragment()
    }
}