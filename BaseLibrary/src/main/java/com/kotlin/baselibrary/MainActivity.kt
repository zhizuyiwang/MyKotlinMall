package com.kotlin.baselibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("123")
    }
}
