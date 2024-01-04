package com.lupawktu.possqlite.db.model

import androidx.room.*

@Entity
data class Store(
    @PrimaryKey(autoGenerate = false)
    val storeId: String,
    val storeName: String,
    val createdAt: Long = System.currentTimeMillis()
)
