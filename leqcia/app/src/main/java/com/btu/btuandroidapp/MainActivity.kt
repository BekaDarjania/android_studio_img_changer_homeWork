package com.btu.btuandroidapp

import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeImage()
    }

    private fun changeImage() {

        var startImage:Drawable = imageView2.drawable

        change_img_button.setOnClickListener {
            if (imageView2.drawable == startImage ){
                imageView2.setImageResource(R.mipmap.ic_light_bulb_on)
            } else {
                imageView2.setImageDrawable(startImage)
            }
        }
    }
}