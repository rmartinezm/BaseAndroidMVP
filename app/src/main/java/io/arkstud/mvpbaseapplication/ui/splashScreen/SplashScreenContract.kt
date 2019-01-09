package io.arkstud.mvpbaseapplication.ui.splashScreen

import io.arkstud.mvpbaseapplication.ui.common.BasePresenter

interface SplashScreenContract {

    interface View {
        fun showMessage(msg: String)
    }

    interface Presenter : BasePresenter<SplashScreenContract.View> {
        fun loadData()
    }

    interface Interactor {
        fun makeRequest(callback: (msg: String) -> Unit)
    }

}