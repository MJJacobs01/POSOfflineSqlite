package za.co.jacobs.mj.database.model

import androidx.room.*

@Entity
data class Store(
    @PrimaryKey(autoGenerate = false)
    val idStore: String,
    val storeName: String,
    val createdAt: Long = System.currentTimeMillis()
)
