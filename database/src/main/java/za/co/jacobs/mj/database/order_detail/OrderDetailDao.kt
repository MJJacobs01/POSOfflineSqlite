package za.co.jacobs.mj.database.order_detail

import androidx.room.*
import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:28
 */

@Dao
interface OrderDetailDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrderDetails(orderDetail: OrderDetail)
    
    @Delete
    suspend fun deleteOrderDetails(orderDetail: OrderDetail)
    
    @Query("select * from orderdetail where orderDetailId =:orderDetailsId")
    suspend fun getOrderDetailsById(orderDetailsId: Int): OrderDetail?
    
    @Query("select * from orderdetail where orderId =:orderId")
    suspend fun getOrderDetailsByOrderId(orderId: String): OrderDetail?
    
    @Query("select * from orderdetail where productId =:productId")
    fun getAllOrderDetailsByProductId(productId: String): Flow<List<OrderDetail?>>
}