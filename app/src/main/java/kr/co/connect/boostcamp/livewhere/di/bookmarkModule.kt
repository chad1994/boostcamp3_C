package kr.co.connect.boostcamp.livewhere.di;

import kr.co.connect.boostcamp.livewhere.ui.main.HomeViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val bookmarkModule = module {
        //factory("bookmarkRepository") { BookmarkRepositoryImpl(get()) as BookmarkRepository }

        viewModel { HomeViewModel() }
}