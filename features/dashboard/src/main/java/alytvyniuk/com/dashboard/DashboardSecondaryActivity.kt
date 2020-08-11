package alytvyniuk.com.dashboard

import android.app.Activity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import javax.inject.Inject

private const val TAG = "DashboardSecondary"

class DashboardSecondaryActivity: Activity() {

    @Inject lateinit var dashboardRepository: DashboardRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        Log.d(TAG, "Show DashboardSecondaryActivity ${dashboardRepository.getData()}")
        setContentView(R.layout.activity_dashboard_secondary)
    }
}