package com.example.wuzheng.kotlinandroid

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import kotlinx.android.synthetic.demo2.*

public class Demo2Activity: Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.demo2)
        myMessage.setText("hello kotlin")
        button.setOnClickListener {
            toast("toast");
        }
    }
    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }

}