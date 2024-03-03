package za.co.jacobs.mj.database.order

import androidx.room.*
import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:14
 */

@Dao
interface OrderDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrder(order: Order)
    
    @Delete
    suspend fun deleteOrder(order: Order)
    
    @Query("select * from `order` order by createdAt desc")
    fun getAllOrders(): Flow<List<Order?>>
    
    @Query("select * from `order` where orderId =:orderId")
    suspend fun getOrderById(orderId: String): Order?
    
    @Query("select * from `order` where buyerName =:buyerName")
    fun getAllOrdersByBuyerName(buyerName: String): Flow<List<Order>>
    
    @Query("select * from `order` where status =:status")
    fun getAllOrdersByStatus(status: String): Flow<List<Order>>
}