package io.arkstud.mvpbaseapplication.ui.splashScreen

interface SplashScreenContract {

    interface View {
        fun showMessage(msg: String)
    }

    interface Presenter {
        fun loadData()
    }

    interface Interactor {
        fun makeRequest(callback: (msg: String) -> Unit)
    }

}