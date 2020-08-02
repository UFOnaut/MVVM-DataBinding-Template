package com.illia.mvvm.template.di.component

import android.app.Application
import com.illia.mvvm.template.di.module.ApiModule
import com.illia.mvvm.template.di.module.DataModule
import com.illia.mvvm.template.di.module.RepositoryModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ApiModule::class, RepositoryModule::class, DataModule::class])
@Singleton
interface TempAppComponent {
    fun inject(application: Application?)
}