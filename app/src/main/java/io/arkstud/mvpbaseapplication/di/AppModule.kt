package io.arkstud.mvpbaseapplication.di

import io.arkstud.mvpbaseapplication.ui.splashScreen.SplashScreenContract
import io.arkstud.mvpbaseapplication.ui.splashScreen.SplashScreenInteractor
import io.arkstud.mvpbaseapplication.ui.splashScreen.SplashScreenPresenter
import org.koin.dsl.module.module

val appModule = module {
    factory<SplashScreenContract.Presenter> { SplashScreenPresenter(get()) }
    factory<SplashScreenContract.Interactor> { SplashScreenInteractor() }
}