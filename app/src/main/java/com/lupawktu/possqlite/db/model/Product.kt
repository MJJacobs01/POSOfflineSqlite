package com.lupawktu.possqlite.db.model

import androidx.room.*

@Entity
data class Product(
    @PrimaryKey(autoGenerate = false)
    val idProduct: String,
    val idCategory: Int,
    val idStore: String,
    val createdAt: Long
)
