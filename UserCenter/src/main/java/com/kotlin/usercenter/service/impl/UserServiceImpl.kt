package com.kotlin.usercenter.service.impl

import com.kotlin.usercenter.service.UserService
import rx.Observable

/**
 *作者：created by Hsf on 2018/6/19 15:13
 */
class UserServiceImpl: UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(false)
    }
}