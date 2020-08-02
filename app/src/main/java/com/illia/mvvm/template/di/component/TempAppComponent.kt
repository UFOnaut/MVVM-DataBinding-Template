package com.illia.mvvm.template.di.component

import com.illia.mvvm.template.di.module.ApiModule
import com.illia.mvvm.template.di.module.DataModule
import com.illia.mvvm.template.di.module.RepositoryModule
import com.illia.mvvm.template.di.module.ViewModelsModule
import com.illia.mvvm.template.ui.activity.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ApiModule::class, RepositoryModule::class, DataModule::class, ViewModelsModule::class])
@Singleton
interface TempAppComponent {
    fun inject(activity: MainActivity)
}