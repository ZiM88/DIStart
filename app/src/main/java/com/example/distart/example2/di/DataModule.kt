package com.example.distart.example2.di

import com.example.distart.example2.data.datasource.ExampleLocalDataSource
import com.example.distart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.distart.example2.data.datasource.ExampleRemoteDataSource
import com.example.distart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}