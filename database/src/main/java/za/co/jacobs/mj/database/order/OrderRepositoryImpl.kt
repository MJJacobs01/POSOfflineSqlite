package za.co.jacobs.mj.database.order

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 16:15
 */

class OrderRepositoryImpl(
    private val orderDao: OrderDao
) : OrderRepository {
    
    override suspend fun insertOrder(order: Order) {
        orderDao.insertOrder(order = order)
    }
    
    override suspend fun deleteOrder(orderId: String) {
        val order = orderDao.getOrderById(orderId = orderId)
        order?.let {
            orderDao.deleteOrder(order = it)
        }
    }
    
    override fun getAllOrders(): Flow<List<Order?>> {
        return orderDao.getAllOrders()
    }
    
    override suspend fun getOrderById(orderId: String): Order? {
        return orderDao.getOrderById(orderId = orderId)
    }
    
    override fun getAllOrdersByBuyerName(buyerName: String): Flow<List<Order?>> {
        return orderDao.getAllOrdersByBuyerName(buyerName = buyerName)
    }
    
    override fun getAllOrdersByStatus(status: String): Flow<List<Order?>> {
        return orderDao.getAllOrdersByStatus(status = status)
    }
}