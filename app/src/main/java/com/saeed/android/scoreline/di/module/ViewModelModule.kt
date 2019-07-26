package com.saeed.android.scoreline.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saeed.android.scoreline.di.util.ViewModelKey
import com.saeed.android.scoreline.ui.dashboard.DashboardViewModel
import com.saeed.android.scoreline.ui.competition.CompetitionViewModel
import com.saeed.android.scoreline.util.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


/**
 * Created by Saeed on 2019-06-14.
 */
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun bindDashboardViewModel(dashboardViewModel: DashboardViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CompetitionViewModel::class)
    abstract fun bindHomeViewModel(competitionViewModel: CompetitionViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}