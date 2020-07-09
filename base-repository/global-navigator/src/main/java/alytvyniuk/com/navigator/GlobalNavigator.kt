package alytvyniuk.com.navigator

import android.app.Activity
import android.content.Intent
import android.os.Bundle

object GlobalNavigator : FeatureNavigator {
    override fun navigate(
        originActivity: Activity,
        destination: Destination,
        bundle: Bundle?,
        flags: Int?,
        requestCode: Int?
    ) {
        val applicationId = originActivity.packageName

        val intent = Intent().apply {
            setClassName(applicationId, destination.destinationActivity)
            flags?.let { setFlags(it) }
        }

        if (requestCode == null) {
            originActivity.startActivity(intent, bundle)
        } else {
            originActivity.startActivityForResult(intent, requestCode, bundle)
        }
    }
}