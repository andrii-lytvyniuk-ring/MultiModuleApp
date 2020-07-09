package alytvyniuk.com.navigator

import android.app.Activity
import android.os.Bundle

interface FeatureNavigator {
    fun navigate(
        originActivity: Activity,
        destination: Destination,
        bundle: Bundle? = null,
        flags: Int? = null,
        requestCode: Int? = null
    )
}