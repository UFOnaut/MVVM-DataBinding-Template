package com.illia.mvvm.template

import android.app.Application
import com.illia.mvvm.template.di.component.AppComponent
import com.illia.mvvm.template.di.module.ApiModule
import com.illia.mvvm.template.di.module.DataModule

class TemplateApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val appComponent: AppComponent = DaggerAppComponent.builder()
            .apiModule(ApiModule(C.BASE_URL))
            .dataModule(DataModule())
            .build()
        appComponent.inject(this)
    }
}