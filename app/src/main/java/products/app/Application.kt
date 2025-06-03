package products.app

import products.app.di.ApplicationComponent
import products.app.di.DaggerApplicationComponent
import android.app.Application
import android.content.Context

class Application : Application() {

    override fun onCreate() {
        appContext = applicationContext
        ApplicationComponent.init(DaggerApplicationComponent.factory().create(this))
        ApplicationComponent.get().inject(this)

        super.onCreate()
    }

    companion object {
        @Volatile
        lateinit var appContext: Context
            private set
    }
}