package io.arkstud.mvpbaseapplication.ui.splashScreen

class SplashScreenPresenter(
    private val view: SplashScreenContract.View,
    private val interactor: SplashScreenContract.Interactor
) : SplashScreenContract.Presenter {

    override fun loadData() { interactor.makeRequest { view.showMessage(it) } }

}