package com.lupawktu.possqlite.features.login

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

/**
 * Created by MJ Jacobs on 2024/01/01 at 12:41
 */

class LoginViewModel : ViewModel() {
    
    var state by mutableStateOf(LoginState())
        private set
    
    fun setUsername(username: String) {
        state = state.copy(username = username)
    }
    
    fun setPassword(password: String) {
        state = state.copy(password = password)
    }
    
    private fun setLoginSuccessful(loginSuccessful: Boolean) {
        state = state.copy(loginSuccessful = loginSuccessful)
    }
}

data class LoginState(
    val username: String = "",
    val password: String = "",
    val loginSuccessful: Boolean = false
)