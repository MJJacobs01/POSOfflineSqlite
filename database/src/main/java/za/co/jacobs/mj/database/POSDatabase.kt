package za.co.jacobs.mj.database

import androidx.room.*
import za.co.jacobs.mj.database.category.*
import za.co.jacobs.mj.database.order.*
import za.co.jacobs.mj.database.order_detail.*
import za.co.jacobs.mj.database.product.*
import za.co.jacobs.mj.database.product_detail.*
import za.co.jacobs.mj.database.store.*
import za.co.jacobs.mj.database.store_detail.*
import za.co.jacobs.mj.database.user.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:36
 */

@Database(
    entities = [Category::class, Order::class, OrderDetail::class, Product::class, ProductDetail::class,
        Store::class, StoreDetail::class, User::class
    ],
    exportSchema = true,
    version = 1
)
abstract class POSDatabase : RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
    abstract fun orderDao(): OrderDao
    abstract fun orderDetailDao(): OrderDetailDao
    abstract fun productDao(): ProductDao
    abstract fun productDetailDao(): ProductDetailDao
    abstract fun storeDao(): StoreDao
    abstract fun storeDetailDao(): StoreDetailDao
    abstract fun userDao(): UserDao
}