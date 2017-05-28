package com.jk.app.kotlinefirst

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jk.app.kotlinefirst.UI.LoginActivityUI
import org.jetbrains.anko.*


class LoginActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoginActivityUI().setContentView(this)
    }


    fun tryLogin(ui: AnkoContext<LoginActivity>, name: CharSequence?, password: CharSequence?) {
        ui.doAsync {
            Thread.sleep(500)
            activityUiThreadWithContext {
                if (checkCredentials(name.toString(), password.toString())) {
                    toast("Logged in! :)")
                    startActivity<MainActivity>()
                } else {
                    toast("Wrong password :( Enter user:password")
                }
            }
        }

    }
    private fun checkCredentials(name: String, password: String) = name == "user" && password == "password"
}


