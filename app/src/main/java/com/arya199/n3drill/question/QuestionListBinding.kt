package com.arya199.n3drill.question

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.arya199.n3drill.data.Question

@BindingAdapter("app:questions")
fun setItems(listView: RecyclerView, items: List<Question>) {
    items.let {
        (listView.adapter as QuestionListAdapter).submitList(items)
    }

}