package com.illia.mvvm.template.di.module

import com.illia.mvvm.template.model.dao.TempDao
import com.illia.mvvm.template.model.dao.TempDaoImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {
    @Provides
    @Singleton
    fun provideTempDao(): TempDao {
        return TempDaoImpl()
    }
}