package com.example.wuzheng.kotlinandroid

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

public class DemoActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  myMessage=TextView(this);
        myMessage.setText("Hello kotlin")
        setContentView(myMessage);
    }
}
