package com.illia.myapplication

import androidx.lifecycle.MutableLiveData

class TempRepository {

    private val data : MutableLiveData<String> = MutableLiveData("123")

    fun getTempData() : MutableLiveData<String> {
        return data
    }

    fun setTempData(value: Int) {
        data.value = value.toString()
    }
}