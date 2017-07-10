package com.jk.app.kotlinefirst

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

/**
 * Created by jitendraprajapati on 28/05/17.
 */
public class MainActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        textview.text=getString(R.string.hi_text)
        button.setOnClickListener({
            toast("button Clicked")
        })

    }
}



