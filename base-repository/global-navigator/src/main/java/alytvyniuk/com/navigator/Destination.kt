package alytvyniuk.com.navigator

sealed class Destination(val destinationActivity: String) {
    object Login: Destination("alytvyniuk.com.login.LoginActivity")
    object Dashboard: Destination("alytvyniuk.com.dashboard.DashboardActivity")
    object Settings: Destination("alytvyniuk.com.settings.SettingsActivity")
}