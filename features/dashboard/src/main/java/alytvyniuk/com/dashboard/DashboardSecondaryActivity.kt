package alytvyniuk.com.dashboard

import android.app.Activity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

private const val TAG = "DashboardSecondary"

class DashboardSecondaryActivity: Activity() {

    @Inject lateinit var dashboardRepository: DashboardRepository

    @Inject lateinit var something: Something

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DashboardFeature.component
            .provideSecondaryActivitySubcomponentFactory()
            .create()
            .inject(this)
        Log.d(TAG, "Show DashboardSecondaryActivity ${dashboardRepository.getData()}")
        setContentView(R.layout.activity_dashboard_secondary)
    }
}