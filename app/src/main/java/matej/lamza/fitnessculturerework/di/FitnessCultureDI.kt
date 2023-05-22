package matej.lamza.fitnessculturerework.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.core.module.Module

class FitnessCultureDI(private val application: Application) {

    private lateinit var koinApplication: KoinApplication
    private val modules: List<Module> = listOf()

    fun initialize() {
        koinApplication = startKoin {
            androidContext(application)
            modules(modules)
            androidLogger(Level.INFO)
        }
    }
}
