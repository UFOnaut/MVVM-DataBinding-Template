package com.illia.mvvm.template.di.module

import com.illia.mvvm.template.model.api.TempApi
import com.illia.mvvm.template.model.dao.TempDao
import com.illia.mvvm.template.model.repository.TempRepository
import com.illia.mvvm.template.model.repository.TempRepositoryImpl
import com.illia.mvvm.template.ui.viewmodel.TempViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ViewModelsModule {
    @Provides
    @Singleton
    fun provideTempViewModel(tempRepository: TempRepository): TempViewModel {
        return TempViewModel(tempRepository)
    }
}