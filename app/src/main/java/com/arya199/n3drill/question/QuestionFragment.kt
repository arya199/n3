package com.arya199.n3drill.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.arya199.n3drill.databinding.QuestionFragBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class QuestionFragment: DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<QuestionViewModel> { viewModelFactory }

    private lateinit var viewDataBinding: QuestionFragBinding

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = QuestionFragBinding.inflate(inflater, container, false)
            .apply {
            }

        return viewDataBinding.root
    }
}