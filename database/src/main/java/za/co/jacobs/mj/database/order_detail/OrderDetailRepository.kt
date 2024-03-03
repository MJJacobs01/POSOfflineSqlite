package za.co.jacobs.mj.database.order_detail

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:29
 */

interface OrderDetailRepository {
    
    suspend fun insertOrderDetails(orderDetail: OrderDetail)
    
    suspend fun deleteOrderDetails(orderDetailsId: Int)
    
    suspend fun getOrderDetailsById(orderDetailsId: Int): OrderDetail?
    
    suspend fun getOrderDetailsByOrderId(orderId: String): OrderDetail?
    
    fun getAllOrderDetailsByProductId(productId: String): Flow<List<OrderDetail?>>
}