package alytvyniuk.com.base

import alytvyniuk.com.navigator.Destination
import alytvyniuk.com.navigator.GlobalNavigator
import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import dagger.android.AndroidInjection
import javax.inject.Inject

private const val TAG = "SplashActivity"

class SplashActivity : Activity() {

    @Inject lateinit var legacyRepository: LegacyRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        Log.d(TAG, "Show SplashActivity ${legacyRepository.getCacheData()}")
        val connectivityApi = ConnectivityApi(this)
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