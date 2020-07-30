package com.illia.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TempViewModel : ViewModel() {
    private val repository: TempRepository = TempRepository()

    var value: String = ""

    fun getTitle() : MutableLiveData<String>{
        return repository.getTempData()
    }

    fun setTitle(value: Int) {
        repository.setTempData(value)
    }
}