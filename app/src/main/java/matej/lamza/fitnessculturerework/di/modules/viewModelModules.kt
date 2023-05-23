package matej.lamza.fitnessculturerework.di.modules

import matej.lamza.fitnessculturerework.app.AppViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { AppViewModel() }
}
