package com.lupawktu.possqlite.activity

import android.os.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import com.lupawktu.possqlite.navigation.*
import com.lupawktu.possqlite.ui.theme.*

/**
 * Created by MJ Jacobs on 2024/01/01 at 10:35
 */

class MainActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POSOfflineSqlite {
                App(activity = this)
            }
        }
    }
}