package matej.lamza.fitnessculturerework

import android.app.Application
import matej.lamza.fitnessculturerework.di.FitnessCultureDI

class FitnessCultureApp : Application() {

    private val fitnessCultureDI by lazy { FitnessCultureDI(this) }

    override fun onCreate() {
        super.onCreate()
        fitnessCultureDI::initialize
    }
}
