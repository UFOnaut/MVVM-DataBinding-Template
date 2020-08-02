package com.illia.mvvm.template.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.illia.mvvm.template.model.dto.GithubItem
import com.illia.mvvm.template.model.repository.TempRepository
import java.util.*

class TempViewModel(private val tempRepository: TempRepository) : ViewModel() {

    var githubItems: MutableLiveData<List<GithubItem>> = MutableLiveData(Collections.emptyList())

    fun getRepositories() {
        githubItems = tempRepository.getRepositories()
    }
}