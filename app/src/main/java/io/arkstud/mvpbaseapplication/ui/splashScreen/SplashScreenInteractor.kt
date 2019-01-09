package io.arkstud.mvpbaseapplication.ui.splashScreen

import android.os.Handler

class SplashScreenInteractor : SplashScreenContract.Interactor {

    override fun makeRequest(callback: (msg: String) -> Unit) {
        Handler().postDelayed({ callback("Hello World!") }, 3000)
    }


}