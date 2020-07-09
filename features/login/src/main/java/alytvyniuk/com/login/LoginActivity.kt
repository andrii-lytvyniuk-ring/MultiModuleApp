package alytvyniuk.com.login

import alytvyniuk.com.navigator.Destination
import alytvyniuk.com.navigator.GlobalNavigator
import android.app.Activity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.dashboardButton
import kotlinx.android.synthetic.main.activity_login.exitButton

private const val TAG = "LoginActivity"

class LoginActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Show LoginActivity")
        setContentView(R.layout.activity_login)
        dashboardButton.setOnClickListener {
            GlobalNavigator.navigate(this, Destination.Dashboard)
            finish()
        }
        exitButton.setOnClickListener {
            finish()
        }
    }
}