package alytvyniuk.com.base.di

import alytvyniuk.com.base.MainApplication
import dagger.android.AndroidInjector

class MainAndroidInjector : AndroidInjector<MainApplication> {

    private val map = mutableMapOf<String, AndroidInjector<Any>>()

    fun add(injector: AndroidInjector<Any>) {
        map
    }

    override fun inject(instance: Any) {
        val key = instance.javaClass.`package`.toString()
        map[key]?.inject(instance)
    }

}