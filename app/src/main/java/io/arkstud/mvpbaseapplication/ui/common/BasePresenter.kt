package io.arkstud.mvpbaseapplication.ui.common

interface BasePresenter<T> {

    fun setView(view: T)

}