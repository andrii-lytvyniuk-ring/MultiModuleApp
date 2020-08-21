package alytvyniuk.com.dashboard

import alytvyniuk.com.base.LegacyRepository
import alytvyniuk.com.navigator.Destination
import alytvyniuk.com.navigator.GlobalNavigator
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_dashboard.*
import javax.inject.Inject

private const val TAG = "DashboardActivity"

class DashboardActivity: Activity() {

    @Inject lateinit var legacyRepository: LegacyRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DashboardFeature.component.inject(this)
        Log.d(TAG, "Show DashboardActivity ${legacyRepository.getCacheData()}")
        setContentView(R.layout.activity_dashboard)
        settingsButton.setOnClickListener {
            GlobalNavigator.navigate(this, Destination.Settings)
        }
        dashboardSecondaryButton.setOnClickListener {
            startActivity(Intent(this, DashboardSecondaryActivity::class.java))
        }
        exitButton.setOnClickListener {
            finish()
        }
    }
}