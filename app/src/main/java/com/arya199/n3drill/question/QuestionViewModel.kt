package com.arya199.n3drill.question

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arya199.n3drill.data.Question
import com.arya199.n3drill.util.wrapEspressoIdlingResource
import kotlinx.coroutines.launch
import javax.inject.Inject

class QuestionViewModel @Inject constructor(private val questionService: InterfaceQuestionService):
    ViewModel() {

    private val _questions = MutableLiveData<List<Question>>().apply { value = emptyList() }
    val questions: LiveData<List<Question>> = _questions
    val selectedQuestion = MutableLiveData<Question>()

    fun loadQuestions() {
        wrapEspressoIdlingResource {
            viewModelScope.launch {
                val questionResult = questionService.getQuestionsByLevel("")
                _questions.value = questionResult
            }
        }
    }

    fun select(item: Question) {
        selectedQuestion.value = item
    }
}