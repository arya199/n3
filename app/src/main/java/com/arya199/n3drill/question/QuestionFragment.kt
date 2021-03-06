package com.arya199.n3drill.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.arya199.n3drill.R
import com.arya199.n3drill.data.Question
import com.arya199.n3drill.databinding.QuestionFragBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class QuestionFragment: DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val sharedViewModel by activityViewModels<QuestionViewModel> { viewModelFactory }

    private lateinit var viewDataBinding: QuestionFragBinding

    private lateinit var listAdapter: QuestionListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = QuestionFragBinding.inflate(inflater, container, false)
            .apply {
                questionViewModel = sharedViewModel
            }

        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewDataBinding.lifecycleOwner = this.viewLifecycleOwner

        setupListAdapter()

        sharedViewModel.loadQuestions()
    }

    private fun setupListAdapter() {
        val viewModel = viewDataBinding.questionViewModel
        if (viewModel != null) {
            listAdapter = QuestionListAdapter(viewModel)
            viewDataBinding.questionList.adapter = listAdapter
            listAdapter.setOnItemClickListener(object: QuestionListAdapter.OnItemClickListener {
                override fun onClick(data: Question) {
                    Toast.makeText(context, data.Bogus_1, Toast.LENGTH_LONG).show()
                    viewModel.select(data)
                    findNavController().navigate(R.id.questionItemFragment)
                }
            })
        }
    }
}