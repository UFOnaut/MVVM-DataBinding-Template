package com.illia.mvvm.template.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.illia.mvvm.template.C
import com.illia.mvvm.template.di.component.DaggerTempAppComponent
import com.illia.mvvm.template.di.component.TempAppComponent
import com.illia.mvvm.template.di.module.ApiModule
import com.illia.mvvm.template.di.module.DataModule
import com.illia.mvvm.template.di.module.RepositoryModule
import com.illia.mvvm.template.di.module.ViewModelsModule
import javax.inject.Inject

abstract class BaseActivity: AppCompatActivity() {

    protected fun getComponent(): TempAppComponent {
        return DaggerTempAppComponent.builder()
            .apiModule(ApiModule(C.BASE_URL))
            .dataModule(DataModule())
            .repositoryModule(RepositoryModule())
            .viewModelsModule(ViewModelsModule())
            .build()
    }
}