package alytvyniuk.com.dashboard

import alytvyniuk.com.base.LegacyRepository
import alytvyniuk.com.base.MainApplication
import alytvyniuk.com.dashboard.di.DaggerDashboardDiComponent
import alytvyniuk.com.navigator.Destination
import alytvyniuk.com.navigator.GlobalNavigator
import android.app.Activity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import kotlinx.android.synthetic.main.activity_dashboard.exitButton
import kotlinx.android.synthetic.main.activity_dashboard.settingsButton
import javax.inject.Inject

private const val TAG = "DashboardActivity"

class DashboardActivity: Activity() {

    @Inject lateinit var legacyRepository: LegacyRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newDi = DaggerDashboardDiComponent.factory().create(application as MainApplication)
        (application as MainApplication).applicationInjector.map[javaClass.`package`.toString()] = newDi as AndroidInjector<Any>
        AndroidInjection.inject(this)
        Log.d(TAG, "Show DashboardActivity ${legacyRepository.getCacheData()}")
        setContentView(R.layout.activity_dashboard)
        settingsButton.setOnClickListener {
            GlobalNavigator.navigate(this, Destination.Settings)
        }
        exitButton.setOnClickListener {
            finish()
        }
    }
}