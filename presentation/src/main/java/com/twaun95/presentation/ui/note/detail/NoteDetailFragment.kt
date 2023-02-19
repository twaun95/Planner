package com.twaun95.presentation.ui.note.detail

import androidx.fragment.app.viewModels
import com.twaun95.presentation.R
import com.twaun95.presentation.base.BaseFragment
import com.twaun95.presentation.databinding.FragmentNoteBinding
import com.twaun95.presentation.databinding.FragmentNoteDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteDetailFragment : BaseFragment<FragmentNoteDetailBinding, NoteDetailFragmentViewModel>(R.layout.fragment_note_detail){
    override val fragmentVM: NoteDetailFragmentViewModel by viewModels<NoteDetailFragmentViewModel>()

    companion object {
        fun newInstance() : NoteDetailFragment = NoteDetailFragment()
    }
}