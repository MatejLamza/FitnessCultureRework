package matej.lamza.fitnessculturerework.common

sealed class ViewState {
    object Loading : ViewState()
    object Authorized : ViewState()
    object Unauthorized : ViewState()
}
