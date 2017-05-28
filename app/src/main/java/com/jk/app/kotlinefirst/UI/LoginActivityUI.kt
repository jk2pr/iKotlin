package com.jk.app.kotlinefirst.UI

import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import com.jk.app.kotlinefirst.LoginActivity
import com.jk.app.kotlinefirst.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by jitendraprajapati on 28/05/17.
 */

public  class LoginActivityUI : AnkoComponent<LoginActivity>{

    private val customStyle = { v: Any ->
        when (v) {
            is Button -> v.textSize = 26f
            is EditText -> v.textSize = 24f
        }
    }

    override fun createView(ui: AnkoContext<LoginActivity>) = with(ui) {
        verticalLayout {
            padding = dip(32)

            imageView(android.R.drawable.ic_menu_manage).lparams {
                margin= dip(16)
                gravity = Gravity.CENTER
            }

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