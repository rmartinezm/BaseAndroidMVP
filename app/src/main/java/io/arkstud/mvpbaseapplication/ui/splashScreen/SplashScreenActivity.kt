package io.arkstud.mvpbaseapplication.ui.splashScreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.arkstud.mvpbaseapplication.R
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class SplashScreenActivity : AppCompatActivity(), SplashScreenContract.View {

    private val presenter: SplashScreenContract.Presenter by inject { parametersOf(this)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        presenter.loadData()
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}
