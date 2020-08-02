package com.illia.mvvm.template.model.repository

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.illia.mvvm.template.model.api.TempApi
import com.illia.mvvm.template.model.dao.TempDao
import com.illia.mvvm.template.model.dto.GithubItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.util.*

class TempRepositoryImpl(private val tempApi: TempApi, private val tempDao: TempDao?) : TempRepository {
    private val gitHubItems: MutableLiveData<List<GithubItem>> = MutableLiveData<List<GithubItem>>(Collections.emptyList())

    @SuppressLint("CheckResult")
    override fun getRepositories(): MutableLiveData<List<GithubItem>> {
        tempApi.getRepositories("ufonaut")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.newThread())
            .subscribe( { result -> gitHubItems.value = result}
            ) { _: Throwable? -> }
        return gitHubItems
    }
}