package com.anwesh.uiprojects.linkedrectwithcirclesview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.rectwithcirclesview.RectWithCirclesView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RectWithCirclesView.create(this)
    }
}
