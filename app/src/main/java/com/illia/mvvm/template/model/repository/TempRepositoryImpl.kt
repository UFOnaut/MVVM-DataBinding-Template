package com.illia.mvvm.template.model.repository

import android.annotation.SuppressLint
import com.illia.mvvm.template.model.api.TempApi
import com.illia.mvvm.template.model.dao.TempDao
import com.illia.mvvm.template.model.dto.GithubItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TempRepositoryImpl(private val tempApi: TempApi, private val tempDao: TempDao?) :
    TempRepository {
    private val gitHubItems: `val`? = null

    @get:SuppressLint("CheckResult")
    override val repositories: Unit
        get() {
            tempApi.getRepositories("ufonaut")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(
                    { githubItems: List<GithubItem?>? -> }
                ) { throwable: Throwable? -> }
        }

}