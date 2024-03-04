package com.lupawktu.possqlite

import android.app.Application
import za.co.jacobs.mj.database.di.*

/**
 * Created by MJ Jacobs on 2024/01/01 at 13:47
 */

class POSOfflineApplication : Application() {
    
    companion object {
        lateinit var databaseModule: DatabaseModule
    }
    
    override fun onCreate() {
        super.onCreate()
        
        databaseModule = DatabaseModuleImpl(context = this)
    }
}