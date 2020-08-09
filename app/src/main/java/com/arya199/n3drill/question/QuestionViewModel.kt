package com.arya199.n3drill.question

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arya199.n3drill.data.Question
import javax.inject.Inject

class QuestionViewModel @Inject constructor(): ViewModel() {

    private val _questions = MutableLiveData<List<Question>>().apply { value = emptyList() }
    val questions: LiveData<List<Question>> = _questions
}