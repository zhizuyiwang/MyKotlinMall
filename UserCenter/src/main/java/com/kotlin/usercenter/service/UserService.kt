package com.kotlin.usercenter.service

import rx.Observable
import rx.Observer

/**
 *作者：created by Hsf on 2018/6/19 15:04
 */
interface UserService {
    fun register (mobile: String,pwd: String, verifyCode: String) : Observable<Boolean>
}