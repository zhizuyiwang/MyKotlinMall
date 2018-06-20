package com.kotlin.usercenter.presenter
import com.kotlin.baselibrary.ext.execute
import com.kotlin.baselibrary.present.BasePresenter
import com.kotlin.baselibrary.rx.BaseSubscriber
import com.kotlin.usercenter.presenter.view.RegisterView
import com.kotlin.usercenter.service.impl.UserServiceImpl
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 *作者：created by Hsf on 2018/6/19 13:48
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifycode: String, pwd: String){
        //业务逻辑
        val userService = UserServiceImpl()
        userService.register(mobile,verifycode,pwd)
                .execute(object : BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })
    }
    fun login(mobile: String, pwd: String){
        //业务逻辑
        val userService = UserServiceImpl()
        userService.register(mobile,"",pwd)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Subscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                    override fun onCompleted() {
                    }
                    override fun onError(e: Throwable?) {
                    }
                })

    }
}