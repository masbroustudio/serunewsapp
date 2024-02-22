package com.serunews.newsapp

import android.app.Application
import com.serunews.core.di.databaseModule
import com.serunews.core.di.networkModule
import com.serunews.core.di.repositoryModule
import com.serunews.newsapp.di.useCaseModule
import com.serunews.newsapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    useCaseModule,
                    repositoryModule,
                    networkModule,
                    viewModelModule,
                    databaseModule,
                )
            )
        }

    }
}