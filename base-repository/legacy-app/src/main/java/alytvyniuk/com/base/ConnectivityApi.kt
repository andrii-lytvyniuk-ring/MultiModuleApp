package alytvyniuk.com.base

import android.content.Context
import android.util.Log
import javax.inject.Inject

private const val TAG = "ConnectivityApi"

class ConnectivityApi(val context: Context) {

    @Inject
    lateinit var legacyRepository: LegacyRepository

    init {
        LegacyApplication.getRingApplicationComponent().inject(this)
        Log.d(TAG, "ConnectivityApi created")
    }

}