package com.jk.app.kotlinefirst.UI

import android.support.v4.content.ContextCompat.getColor
import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import com.jk.app.kotlinefirst.LoginActivity
import com.jk.app.kotlinefirst.R
import kotlinx.android.synthetic.main.activity_main.view.*
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by jitendraprajapati on 28/05/17.
 */

class LoginActivityUI : AnkoComponent<LoginActivity>{

    private val customStyle = { v: Any ->
        when (v) {
            is Button -> v.textSize = 26f
            is EditText -> v.textSize = 24f
        }
    }

    override fun createView(ui: AnkoContext<LoginActivity>) = with(ui) {
        verticalLayout {
            padding = dip(32)



            val name = editText {
                hintResource = R.string.Jitendra
            }
            val password = editText {
                hintResource = R.string.password
                inputType = TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD
            }

            button("Log in") {
                onClick {
                    ui.owner.tryLogin(ui, name.text, password.text)
                }
            }

        }.applyRecursively(customStyle)
    }

}