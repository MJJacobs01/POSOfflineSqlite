package com.lupawktu.possqlite.navigation

import android.app.Activity
import androidx.compose.runtime.*
import com.lupawktu.possqlite.features.login.*

/**
 * Created by MJ Jacobs on 2024/01/01 at 10:41
 */

@Composable
fun App(activity: Activity) {
    val navController = rememberNavigationController(startDestination = Screens.Login)
    val backStack = navController.backStack.collectAsState().value
    val currentScreen = backStack.last()
    
    //  Add window size class to make sure what the condition of the layout is
    when (currentScreen) {
        is Screens.Login -> {
            LoginScreen(navController = navController)
        }
    }
}