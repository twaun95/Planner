package com.twaun95.presentation.ui.note.create

import androidx.fragment.app.viewModels
import com.twaun95.presentation.R
import com.twaun95.presentation.base.BaseFragment
import com.twaun95.presentation.databinding.FragmentNoteCreateBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteCreateFragment : BaseFragment<FragmentNoteCreateBinding, NoteCreateFragmentViewModel>(R.layout.fragment_note_create){
    override val fragmentVM: NoteCreateFragmentViewModel by viewModels<NoteCreateFragmentViewModel>()

    companion object {
        fun newInstance() : NoteCreateFragment = NoteCreateFragment()
    }
}