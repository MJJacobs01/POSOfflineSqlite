package za.co.jacobs.mj.database.model

import androidx.room.*

@Entity
data class Category(
    @PrimaryKey(autoGenerate = false)
    val idCategory: String,
    val idStore: String,
    val name: String,
    val createdAt: Long = System.currentTimeMillis()
)
