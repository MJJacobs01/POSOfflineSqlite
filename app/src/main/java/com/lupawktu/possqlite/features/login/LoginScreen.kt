package com.lupawktu.possqlite.features.login

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.res.*
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.style.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.*
import androidx.lifecycle.viewmodel.compose.*
import com.lupawktu.possqlite.R
import com.lupawktu.possqlite.navigation.*
import com.lupawktu.possqlite.ui.theme.*
import com.lupawktu.possqlite.utils.*

/**
 * Created by MJ Jacobs on 2024/01/01 at 10:46
 */

@Composable
fun LoginScreen(
    navController: NavigationController,
    viewModel:LoginViewModel = viewModel(factory = ViewModelFactory)
) {
    val scrollState = rememberScrollState()
    val state = viewModel.state
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = scrollState),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        content = {
            Image(
                painter = painterResource(id = R.drawable.pos),
                contentDescription = stringResource(R.string.pos_icon),
                modifier = Modifier.size(logoSize)
            )
            
            Spacer(modifier = Modifier.height(halfPadding))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = state.username,
                onValueChange = viewModel::setUsername,
                label = {
                    Text(text = stringResource(R.string.username))
                }
            )
            
            Spacer(modifier = Modifier.height(halfPadding))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = state.password,
                onValueChange = viewModel::setPassword,
                label = {
                    Text(text = stringResource(R.string.password))
                },
                visualTransformation = PasswordVisualTransformation()
            )
            
            Spacer(modifier = Modifier.height(halfPadding))
            Button(
                onClick = {
                    //  TODO: 2024/01/01 - Create function
                },
                modifier = Modifier.fillMaxWidth(),
                content = {
                    Text(text = stringResource(R.string.login).uppercase())
                }
            )
            
            Spacer(modifier = Modifier.height(halfPadding))
            Text(text = stringResource(R.string.or))
            
            Spacer(modifier = Modifier.height(halfPadding))
            Button(
                onClick = {
                    //  TODO: 2024/01/01 - Create function
                },
                modifier = Modifier.fillMaxWidth(),
                content = {
                    Text(text = stringResource(R.string.create_new_account).uppercase())
                }
            )
            
            Spacer(modifier = Modifier.height(halfPadding))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        //  TODO: 2024/01/01 - Create the function
                    },
                text = stringResource(R.string.forgot_password),
                textAlign = TextAlign.End
            )
        }
    )
}