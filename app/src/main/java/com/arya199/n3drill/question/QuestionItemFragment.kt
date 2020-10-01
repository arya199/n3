package com.arya199.n3drill.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.arya199.n3drill.databinding.QuestionItemFragBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class QuestionItemFragment: DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val sharedViewModel by activityViewModels<QuestionViewModel> { viewModelFactory }

    private lateinit var viewDataBinding: QuestionItemFragBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = QuestionItemFragBinding.inflate(inflater, container, false)
            .apply {
                questionViewModel = sharedViewModel
            }
        return viewDataBinding.root
    }
}