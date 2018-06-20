package com.kotlin.baselibrary.rx

import rx.Subscriber

/**
 *作者：created by Hsf on 2018/6/19 15:28
 */
open class BaseSubscriber<T> : Subscriber<T>(){
    override fun onNext(t: T) {
    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }
}