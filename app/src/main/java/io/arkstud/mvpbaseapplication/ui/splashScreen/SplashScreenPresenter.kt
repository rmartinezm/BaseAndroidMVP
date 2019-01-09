package io.arkstud.mvpbaseapplication.ui.splashScreen

class SplashScreenPresenter(
    private val interactor: SplashScreenContract.Interactor
) : SplashScreenContract.Presenter {

    private var view: SplashScreenContract.View? = null

    override fun setView(view: SplashScreenContract.View) { this.view = view }

    override fun loadData() { interactor.makeRequest { view?.showMessage(it) } }

}