package za.co.jacobs.mj.database.category

import androidx.room.*

@Entity
data class Category(
    @PrimaryKey(autoGenerate = false)
    val categoryId: String,
    val storeId: String,
    val name: String,
    val createdAt: Long = System.currentTimeMillis()
)
