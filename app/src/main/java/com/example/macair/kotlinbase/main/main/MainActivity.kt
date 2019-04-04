package com.example.kointest.view.main.main

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.kointest.model.main.restclient.adapters.RecyclerAdapter
import com.example.kointest.model.main.restclient.model.Row
import com.example.kointest.presenter.main.MainPresenter
import com.example.kointest.view.main.detail.DetailActivity
import com.example.macair.kotlinbase.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.getUser(1)
    }

    override fun showData(list: List<Row>) {
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.adapter = RecyclerAdapter(list) { partItem: Row ->
            val goToNextAcitivyt = Intent(this, DetailActivity::class.java)
            goToNextAcitivyt.putExtra("mainActivity", partItem.id.toString())
            startActivity(goToNextAcitivyt)
        }
    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }
}
