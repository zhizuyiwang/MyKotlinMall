package com.kotlin.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.usercenter.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_test)
        verticalLayout {
            padding = 30
            editText {
                hint = "Name"
                textSize = 24f
            }
            editText {
                hint = "pwd"
                textSize = 24f
            }
            button {
                text = "test"
                onClick {
                    toast("${intent.getIntExtra("id",-1)}")
                }
            }
        }

    }
}
