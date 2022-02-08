package com.example.testing.view.mainactivity

import com.example.testing.repository.IMainActivityRepository
import com.example.testing.repository.MainActivityRepository
import com.example.testing.retofit.ApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class MainModule {
    @Provides
    fun provideAboutRepository(apiInterface: ApiInterface): IMainActivityRepository {
        return MainActivityRepository(apiInterface)
    }
}