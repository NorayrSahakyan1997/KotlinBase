package com.example.kointest.view.main.detail

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.kointest.model.main.restclient.model.Row
import com.example.kointest.presenter.main.DetailPresenter
import com.example.macair.kotlinbase.R


class DetailActivity : MvpAppCompatActivity(),DetailView {

    @InjectPresenter
    lateinit var detailPresenter: DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
//        val ss:String = intent.getStringExtra("mainActivity")

    }

    override fun showData(list: List<Row>) {
    }

    override fun showProgress() {
    }

    override fun hideProgress() {
    }
}
