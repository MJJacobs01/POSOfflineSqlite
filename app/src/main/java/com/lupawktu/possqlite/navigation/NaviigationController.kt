package com.lupawktu.possqlite.navigation

import androidx.compose.runtime.*
import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/01/01 at 10:40
 */

class NavigationController(startDestination: Any) {
    
    private var _backStack = MutableStateFlow(listOf<Any>(startDestination))
    val backStack: StateFlow<List<Any>> = _backStack.asStateFlow()
    
    fun navigateTo(screen: Any) {
        if (_backStack.value.last() == screen) return
        
        _backStack.update { currentScreens ->
            currentScreens + screen
        }
    }
    
    fun navigateBack() {
        _backStack.update { currentScreens ->
            currentScreens.dropLast(1)
        }
    }
}

/**
 * startDestination should be be a sealed class or enum type
 */
@Composable
fun rememberNavigationController(startDestination: Any): NavigationController {
    return remember {
        NavigationController(startDestination = startDestination)
    }
}