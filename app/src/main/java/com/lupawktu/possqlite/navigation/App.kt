package com.lupawktu.possqlite.navigation

import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import com.lupawktu.possqlite.features.login.*
import com.lupawktu.possqlite.ui.components.*
import com.lupawktu.possqlite.ui.theme.*

/**
 * Created by MJ Jacobs on 2024/01/01 at 10:41
 */

@Composable
fun App(activity: Activity) {
    val navController = rememberNavigationController(startDestination = Screens.Login)
    val backStack = navController.backStack.collectAsState().value
    val currentScreen = backStack.last()
    
    val scaffoldState by remember { mutableStateOf(AppScaffoldState()) }
    
    //  Add window size class to make sure what the condition of the layout is
    AppScaffold(
        modifier = Modifier
            .fillMaxSize(),
        onNavigateBackIconClicked = {
            navController.navigateBack()
        },
        state = scaffoldState,
        content = {
            CurrentScreenToDisplay(
                navController = navController,
                currentScreen = currentScreen
            )
        }
    )
}

@Composable
private fun CurrentScreenToDisplay(
    navController: NavigationController,
    currentScreen: Any
) {
    when (currentScreen) {
        is Screens.Login -> {
            LoginScreen(navController = navController)
        }
    }
}