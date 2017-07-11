package com.jk.app.kotlinefirst

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

/**
 * Created by jitendraprajapati on 28/05/17.
 */
public class MainActivity: Activity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        toast("OnCreate Clicked")

      //  textview.text=getString(R.string.hi_text)
      /*  button.setOnClickListener({
            toast("button Clicked")
        })t*/


    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
          button.setOnClickListener({
           toast("button Clicked")
       })


    }
}



