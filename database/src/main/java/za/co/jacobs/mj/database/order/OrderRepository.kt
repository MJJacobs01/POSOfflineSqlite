package za.co.jacobs.mj.database.order

import kotlinx.coroutines.flow.*
import za.co.jacobs.mj.database.order.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:14
 */

interface OrderRepository {
    
    suspend fun insertOrder(order: Order)
    
    suspend fun deleteOrder(orderId: String)
    
    fun getAllOrders(): Flow<List<Order?>>
    
    suspend fun getOrderById(orderId: String): Order?
    
    fun getAllOrdersByBuyerName(buyerName: String): Flow<List<Order?>>
    
    fun getAllOrdersByStatus(status: String): Flow<List<Order?>>
}