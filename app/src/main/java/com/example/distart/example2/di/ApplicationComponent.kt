package com.example.distart.example2.di

import android.content.Context
import com.example.distart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(contex: Context): ApplicationComponentBuilder

        @BindsInstance
        fun timeMIllis(timeMillis: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }
}