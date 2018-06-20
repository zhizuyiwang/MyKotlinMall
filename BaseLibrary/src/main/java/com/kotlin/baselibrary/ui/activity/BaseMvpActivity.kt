package com.kotlin.baselibrary.ui.activity

import com.kotlin.baselibrary.present.BasePresenter
import com.kotlin.baselibrary.present.view.BaseView

/**
 *作者：created by Hsf on 2018/6/19 13:41
 */
open class BaseMvpActivity<T: BasePresenter<*>> : BaseActivity(),BaseView {
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    lateinit var mPresenter: T
}