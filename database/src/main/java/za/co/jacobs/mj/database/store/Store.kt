package za.co.jacobs.mj.database.store

import androidx.room.*
import kotlinx.datetime.*

@Entity
data class Store(
    @PrimaryKey(autoGenerate = false)
    val storeId: String,
    val storeName: String,
    val createdAt: Long = Clock.System.now().epochSeconds
)
