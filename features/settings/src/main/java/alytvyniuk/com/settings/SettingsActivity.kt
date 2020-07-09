package alytvyniuk.com.settings

import android.app.Activity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_settings.backButton

private const val TAG = "SettingsActivity"

class SettingsActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Show SettingsActivity")
        setContentView(R.layout.activity_settings)
        backButton.setOnClickListener {
            finish()
        }
    }
}