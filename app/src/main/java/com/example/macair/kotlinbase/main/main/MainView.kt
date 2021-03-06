package com.example.kointest.view.main.main

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.kointest.model.main.restclient.model.Row

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView: MvpView {

    fun showData(list:List<Row>)

    fun showProgress()

    fun hideProgress()
}