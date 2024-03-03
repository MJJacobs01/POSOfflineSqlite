package za.co.jacobs.mj.database.order_detail

import androidx.room.*

@Entity
data class OrderDetail(
    @PrimaryKey(autoGenerate = true)
    val orderDetailId: Int = 0,
    val orderId: String,
    val productId: String,
    val name: String,
    val priceSell: Double,
    val totalPrice: Double,
    val qty: Int,
    val createdAt: Long = System.currentTimeMillis()
)
