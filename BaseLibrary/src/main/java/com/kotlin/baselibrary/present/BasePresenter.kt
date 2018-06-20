package com.kotlin.baselibrary.present

import com.kotlin.baselibrary.present.view.BaseView

/**
 *作者：created by Hsf on 2018/6/19 13:38
 */
open class BasePresenter<T: BaseView> {
    lateinit var mView: T
}