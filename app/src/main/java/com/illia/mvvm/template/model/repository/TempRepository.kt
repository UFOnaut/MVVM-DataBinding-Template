package com.illia.mvvm.template.model.repository

import androidx.lifecycle.MutableLiveData
import com.illia.mvvm.template.model.dto.GithubItem

interface TempRepository {
    fun getRepositories(): MutableLiveData<List<GithubItem>>
}