package alytvyniuk.com.base

import alytvyniuk.com.navigator.Destination
import alytvyniuk.com.navigator.GlobalNavigator
import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.util.Log

private const val TAG = "SplashActivity"

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Show SplashActivity")
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(
            {
                GlobalNavigator.navigate(this@SplashActivity, Destination.Login)
                finish()
            },
            1000
        )
    }
}