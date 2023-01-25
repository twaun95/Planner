package com.twaun95.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.twaun95.presentation.databinding.ItemNoteBinding

class NoteAdapter(
    var onItemClickListener: (()->Unit)? = null
) : ListAdapter<NoteAdapter.NoteEntity, NoteAdapter.NoteViewHolder>(diffUtl){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        return holder.bind(getItem(position)){
            onItemClickListener?.invoke()
        }
    }

    inner class NoteViewHolder(
        private val binding: ItemNoteBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(
            data: NoteEntity,
            itemClickListener:(()->Unit)
        ) {
            binding.data = data
            binding.buttonDetail.setOnClickListener {
                itemClickListener.invoke()
            }
        }
    }

    data class NoteEntity(
        val title: String
    )

    companion object {
        val diffUtl = object: DiffUtil.ItemCallback<NoteEntity>() {
            override fun areItemsTheSame(oldItem: NoteEntity, newItem: NoteEntity): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: NoteEntity, newItem: NoteEntity): Boolean {
                return oldItem.title == newItem.title
            }

        }
    }
}