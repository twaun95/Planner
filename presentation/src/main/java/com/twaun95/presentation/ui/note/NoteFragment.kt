package com.twaun95.presentation.ui.note

import androidx.fragment.app.viewModels
import com.twaun95.presentation.R
import com.twaun95.presentation.base.BaseFragment
import com.twaun95.presentation.databinding.FragmentNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteFragment : BaseFragment<FragmentNoteBinding, NoteFragmentViewModel>(R.layout.fragment_note) {
    override val fragmentVM: NoteFragmentViewModel by viewModels<NoteFragmentViewModel>()

    companion object {
        fun newInstance(): NoteFragment = NoteFragment()
    }
}