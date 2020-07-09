package alytvyniuk.com.dashboard

import alytvyniuk.com.navigator.Destination
import alytvyniuk.com.navigator.GlobalNavigator
import android.app.Activity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_dashboard.exitButton
import kotlinx.android.synthetic.main.activity_dashboard.settingsButton

private const val TAG = "DashboardActivity"

class DashboardActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Show DashboardActivity")
        setContentView(R.layout.activity_dashboard)
        settingsButton.setOnClickListener {
            GlobalNavigator.navigate(this, Destination.Settings)
        }
        exitButton.setOnClickListener {
            finish()
        }
    }
}