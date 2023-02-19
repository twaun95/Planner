package com.twaun95.presentation.ui.note

import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleCoroutineScope
import com.twaun95.presentation.R
import com.twaun95.presentation.adapter.NoteAdapter
import com.twaun95.presentation.base.BaseDialog
import com.twaun95.presentation.base.BaseFragment
import com.twaun95.presentation.databinding.FragmentNoteBinding
import com.twaun95.presentation.dialog.CommonDialog
import com.twaun95.presentation.dialog.FullDialog
import com.twaun95.presentation.ui.note.create.NoteCreateFragment
import com.twaun95.presentation.ui.note.detail.NoteDetailFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteFragment : BaseFragment<FragmentNoteBinding, NoteFragmentViewModel>(R.layout.fragment_note) {
    override val fragmentVM: NoteFragmentViewModel by viewModels<NoteFragmentViewModel>()
    private val noteAdapter by lazy { NoteAdapter() }

    override fun initView() {
        super.initView()

        setRecyclerView()
    }

    override fun onStart() {
        super.onStart()
        noteAdapter.submitList(listOf(NoteAdapter.NoteEntity("벤치프레스"), NoteAdapter.NoteEntity("데드리프트"), NoteAdapter.NoteEntity("스쿼트")))

    }

    override fun setEvent() {
        super.setEvent()

        binding.buttonAdd.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                .add(R.id.frame_main, NoteCreateFragment.newInstance())
                .addToBackStack(null)
                .commit()
        }

        binding.buttonAddTest.setOnClickListener {
            noteAdapter.submitList(listOf(NoteAdapter.NoteEntity("벤치프레스"), NoteAdapter.NoteEntity("데드리프트"), NoteAdapter.NoteEntity("스쿼트")))
        }
    }

    private fun setRecyclerView() {
        binding.listNote.adapter = noteAdapter.apply {
            onItemClickListener = {

                parentFragmentManager.beginTransaction()
                    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                    .add(R.id.frame_main, NoteDetailFragment.newInstance())
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    companion object {
        fun newInstance(): NoteFragment = NoteFragment()
    }
}