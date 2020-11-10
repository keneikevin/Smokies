package com.example.smokies.di

import android.content.Context
import androidx.room.Room
import com.example.smokies.db.ProfitDataBase
import com.example.smokies.other.Constants.PROFIT_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app:Context
    ) = Room.databaseBuilder(
        app,
        ProfitDataBase::class.java,
        PROFIT_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideProfitDao(db:ProfitDataBase)= db.getProfitDao()
}