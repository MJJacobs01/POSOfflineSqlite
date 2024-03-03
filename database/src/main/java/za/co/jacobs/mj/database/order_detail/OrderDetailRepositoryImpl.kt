package za.co.jacobs.mj.database.order_detail

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:29
 */

class OrderDetailRepositoryImpl(
    private val orderDetailDao: OrderDetailDao
) : OrderDetailRepository {
    override suspend fun insertOrderDetails(orderDetail: OrderDetail) {
        orderDetailDao.insertOrderDetails(orderDetail = orderDetail)
    }
    
    override suspend fun deleteOrderDetails(orderDetailsId: Int) {
        val orderDetail = orderDetailDao.getOrderDetailsById(orderDetailsId = orderDetailsId)
        orderDetail?.let {
            orderDetailDao.deleteOrderDetails(orderDetail = it)
        }
    }
    
    override suspend fun getOrderDetailsById(orderDetailsId: Int): OrderDetail? {
        return orderDetailDao.getOrderDetailsById(orderDetailsId = orderDetailsId)
    }
    
    override suspend fun getOrderDetailsByOrderId(orderId: String): OrderDetail? {
        return orderDetailDao.getOrderDetailsByOrderId(orderId = orderId)
    }
    
    override fun getAllOrderDetailsByProductId(productId: String): Flow<List<OrderDetail?>> {
        return orderDetailDao.getAllOrderDetailsByProductId(productId = productId)
    }
}