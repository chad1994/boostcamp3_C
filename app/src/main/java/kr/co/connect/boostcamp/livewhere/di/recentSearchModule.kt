package kr.co.connect.boostcamp.livewhere.di

import kr.co.connect.boostcamp.livewhere.repository.RecentSearchRepositoryImpl
import kr.co.connect.boostcamp.livewhere.ui.main.SearchViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val recentSearchModule = module {
    single("recentSearchRepository") { RecentSearchRepositoryImpl(get("recentSearchDatabaseModule")) }
    
    viewModel { SearchViewModel(get("recentSearchRepository")) }
}