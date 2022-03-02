package com.example.oasispersonalprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.google.android.material.appbar.AppBarLayout

class MainActivity : AppCompatActivity() {
    var colorCode:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val appbar = findViewById<Toolbar>(R.id.appbar)

        toolbar.title = ("OasisDev")
        setSupportActionBar(findViewById(R.id.toolbar))

        appbar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener{
            appBarLayout, i ->

                colorCode = -i
                if (colorCode > 255) colorCode = 255

            //Hide toolbar when scrolling

            toolbar.background.alpha = colorCode
            toolbar.alpha = colorCode/256f

        })
    }
}