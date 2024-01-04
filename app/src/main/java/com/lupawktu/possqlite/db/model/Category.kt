package com.lupawktu.possqlite.db.model

import androidx.room.*

@Entity
data class Category(
    @PrimaryKey(autoGenerate = false)
    val idCategory: String,
    val storeId: String,
    val name: String,
    val createdAt: Long = System.currentTimeMillis()
)
