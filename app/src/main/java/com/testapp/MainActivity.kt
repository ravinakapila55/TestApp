package com.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivityScreen ","TestChange")
    }

    /* git config --global user.email "you@example.com"
  git config --global user.name "Your Name"
cls*/
}