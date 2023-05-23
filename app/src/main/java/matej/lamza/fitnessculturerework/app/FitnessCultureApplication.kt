package matej.lamza.fitnessculturerework.app

import android.app.Application
import matej.lamza.fitnessculturerework.di.FitnessCultureDI

class FitnessCultureApplication : Application() {

    private val fitnessCultureDI by lazy { FitnessCultureDI(this) }

    override fun onCreate() {
        super.onCreate()
        fitnessCultureDI::initialize
    }
}
