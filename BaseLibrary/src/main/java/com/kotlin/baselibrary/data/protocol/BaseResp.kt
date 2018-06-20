package com.kotlin.baselibrary.data.protocol

/**
 *作者：created by Hsf on 2018/6/20 11:34
 */
class BaseResp<out T>(val status: Int,val message: String,val data: T) {

}