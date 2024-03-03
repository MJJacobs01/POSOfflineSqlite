package za.co.jacobs.mj.database.di

import android.content.Context
import androidx.room.*
import za.co.jacobs.mj.database.*
import za.co.jacobs.mj.database.category.*
import za.co.jacobs.mj.database.order.*
import za.co.jacobs.mj.database.order_detail.*
import za.co.jacobs.mj.database.product.*
import za.co.jacobs.mj.database.product_detail.*
import za.co.jacobs.mj.database.store.*
import za.co.jacobs.mj.database.store_detail.*
import za.co.jacobs.mj.database.user.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:55
 */

class DatabaseModuleImpl(
    private val context: Context
) : DatabaseModule {
    
    private val db = Room.databaseBuilder(
        context,
        POSDatabase::class.java,
        "POSDb"
    ).build()
    override val categoryRepository: CategoryRepository
        get() = CategoryRepositoryImpl(categoryDao = db.categoryDao())
    override val orderRepository: OrderRepository
        get() = OrderRepositoryImpl(orderDao = db.orderDao())
    override val orderDetailRepository: OrderDetailRepository
        get() = OrderDetailRepositoryImpl(orderDetailDao = db.orderDetailDao())
    override val productRepository: ProductRepository
        get() = TODO("Not yet implemented")
    override val productDetailRepository: ProductDetailRepository
        get() = TODO("Not yet implemented")
    override val storeRepository: StoreRepository
        get() = TODO("Not yet implemented")
    override val storeDetailRepository: StoreDetailRepository
        get() = TODO("Not yet implemented")
    override val userRepository: UserRepository
        get() = TODO("Not yet implemented")
}