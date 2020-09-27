package com.arya199.n3drill.question

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.arya199.n3drill.data.Question
import com.arya199.n3drill.databinding.QuestionListItemBinding

class QuestionListAdapter(private val questionViewModel: QuestionViewModel): ListAdapter<Question,
        QuestionListAdapter.ViewHolder>(QuestionDiffCallback()) {

    lateinit var listener: OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        setOnItemClickListener(listener)
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
        holder.itemView.setOnClickListener { listener.onClick(item) }
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    class ViewHolder private constructor(private val binding: QuestionListItemBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Question) {
            binding.question = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = QuestionListItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class QuestionDiffCallback: DiffUtil.ItemCallback<Question>() {
        override fun areItemsTheSame(oldItem: Question, newItem: Question): Boolean {
            return oldItem.Id == newItem.Id
        }

        override fun areContentsTheSame(oldItem: Question, newItem: Question): Boolean {
            return oldItem.Question == newItem.Question
        }
    }

    interface OnItemClickListener {
        fun onClick(data: Question)
    }
}