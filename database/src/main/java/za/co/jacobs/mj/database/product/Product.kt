package za.co.jacobs.mj.database.product

import androidx.room.*
import kotlinx.datetime.*

@Entity
data class Product(
    @PrimaryKey(autoGenerate = false)
    val productId: String,
    val categoryId: Int,
    val storeId: String,
    val createdAt: Long = Clock.System.now().epochSeconds
)
