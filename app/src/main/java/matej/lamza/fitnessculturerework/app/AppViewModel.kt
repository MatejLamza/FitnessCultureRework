package matej.lamza.fitnessculturerework.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*
import matej.lamza.fitnessculturerework.common.ViewState

class AppViewModel : ViewModel() {

    private val isAuthorized: Flow<Boolean> = flowOf(false)

    val viewState = isAuthorized.map {
        if (it) ViewState.Authorized
        else ViewState.Unauthorized
    }.stateIn(viewModelScope, initialValue = ViewState.Loading, started = SharingStarted.Lazily)
}
