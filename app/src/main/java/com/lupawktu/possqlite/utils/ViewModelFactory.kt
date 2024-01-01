package com.lupawktu.possqlite.utils

import androidx.lifecycle.*
import androidx.lifecycle.viewmodel.*
import com.lupawktu.possqlite.activity.*
import com.lupawktu.possqlite.features.login.*

/**
 * Created by MJ Jacobs on 2024/01/01 at 12:57
 */

@Suppress("UNCHECKED_CAST")
val ViewModelFactory = object : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(
        modelClass: Class<T>,
        extras: CreationExtras
    ): T = with(modelClass) {
        val application =
            checkNotNull(extras[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]) as POSOfflineApplication
        //  val tasksRepository = application.taskRepository //  TODO: 2024/01/01 - Need to add repository here
        //  TODO: 2024/01/01 - All viewModels to be added here with dependencies
        when {
            isAssignableFrom(LoginViewModel::class.java) ->
                LoginViewModel()
            
            else ->
                throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
        }
    } as T
}