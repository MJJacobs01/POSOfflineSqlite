package za.co.jacobs.mj.database.model

import androidx.room.*

@Entity
data class OrderDetails(
    @PrimaryKey(autoGenerate = true)
    val idOrderDetails: Int = 0,
    val idOrder: String,
    val idProduct: String,
    val name: String,
    val priceSell: Double,
    val totalPrice: Double,
    val qty: Int,
    val createdAt: Long = System.currentTimeMillis()
)
