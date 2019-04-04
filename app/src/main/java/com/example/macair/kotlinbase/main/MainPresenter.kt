package com.example.kointest.presenter.main

import android.annotation.SuppressLint
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.kointest.model.main.restclient.MainComponent
import com.example.kointest.view.main.main.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@InjectViewState
class MainPresenter: MvpPresenter<MainView>() {

    val mainComponent: MainComponent = MainComponent()

    @SuppressLint("CheckResult")
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showProgress()
    }
    @SuppressLint("CheckResult")
    fun getUser(favoriteId:Int){
        mainComponent
                .getUsers(favoriteId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    viewState.showData(response.listUsers)
                    viewState.hideProgress()
                }, { error ->
                    error.printStackTrace()
                    viewState.hideProgress()
                })
    }
}