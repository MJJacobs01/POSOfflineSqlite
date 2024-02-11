package za.co.jacobs.mj.database.model

import androidx.room.*

@Entity
data class Product(
    @PrimaryKey(autoGenerate = false)
    val idProduct: String,
    val idCategory: Int,
    val idStore: String,
    val createdAt: Long = System.currentTimeMillis()
)
