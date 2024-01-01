package com.lupawktu.possqlite.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.*
import com.lupawktu.possqlite.R
import com.lupawktu.possqlite.ui.theme.*
import kotlinx.coroutines.channels.*

/**
 * Created by MJ Jacobs on 2024/01/01 at 14:11
 */

@Composable
fun AppScaffold(
    modifier: Modifier = Modifier,
    state: AppScaffoldState,
    onNavigateBackIconClicked: () -> Unit,
    content: @Composable () -> Unit
) {
    val snackBarHostState = remember { SnackbarHostState() }
    
    Scaffold(
        modifier = modifier
            .fillMaxSize(),
        topBar = {
            if (!state.shouldTopAppBarBeVisible) return@Scaffold
            TopBar(
                title = state.topBarTitle,
                shouldBackNavigationIconBeVisible = state.shouldBackNavigationIconBeVisible,
                onNavigateBackIconClicked = onNavigateBackIconClicked
            )
        },
        snackbarHost = {
            SnackbarHost(
                hostState = snackBarHostState
            )
        },
        content = { padding ->
            Box(
                modifier = Modifier.padding(
                    top = padding.calculateTopPadding().plus(normalPadding),
                    bottom = padding.calculateBottomPadding().plus(normalPadding),
                    start = normalPadding,
                    end = normalPadding
                )
            ) {
                content()
            }
        }
    )
    
    LaunchedEffect(key1 = state.snackBarMessage) {
        if (state.snackBarMessage.isEmpty()) return@LaunchedEffect
        snackBarHostState.showSnackbar(
            message = state.snackBarMessage
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String,
    shouldBackNavigationIconBeVisible: Boolean = true,
    onNavigateBackIconClicked: () -> Unit
) {
    //  TODO: 2024/01/01 - Add in logic for the menu items for the more menu
    
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth(),
        title = {
            Text(
                text = title
            )
        },
        navigationIcon = {
            if (!shouldBackNavigationIconBeVisible) return@TopAppBar
            IconButton(
                onClick = onNavigateBackIconClicked,
                content = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.navigate_back_icon)
                    )
                }
            )
        },
        actions = {
            IconButton(
                onClick = {
                
                },
                content = {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = stringResource(R.string.more_options),
                    )
                }
            )
        }
    )
}

data class AppScaffoldState(
    val topBarTitle: String = "",
    val shouldTopAppBarBeVisible: Boolean = false,
    val shouldBackNavigationIconBeVisible: Boolean = false,
    val snackBarMessage: String = ""
)