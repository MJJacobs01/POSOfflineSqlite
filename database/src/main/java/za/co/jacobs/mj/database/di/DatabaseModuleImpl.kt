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
        get() = ProductRepositoryImpl(productDao = db.productDao())
    override val productDetailRepository: ProductDetailRepository
        get() = ProductDetailRepositoryImpl(productDetailDao = db.productDetailDao())
    override val storeRepository: StoreRepository
        get() = StoreRepositoryImpl(storeDao = db.storeDao())
    override val storeDetailRepository: StoreDetailRepository
        get() = StoreDetailRepositoryImpl(storeDetailDao = db.storeDetailDao())
    override val userRepository: UserRepository
        get() = UserRepositoryImpl(userDao = db.userDao())
}