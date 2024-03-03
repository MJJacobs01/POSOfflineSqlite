package za.co.jacobs.mj.database.di

import za.co.jacobs.mj.database.category.*
import za.co.jacobs.mj.database.order.*
import za.co.jacobs.mj.database.order_detail.*
import za.co.jacobs.mj.database.product.*
import za.co.jacobs.mj.database.product_detail.*
import za.co.jacobs.mj.database.store.*
import za.co.jacobs.mj.database.store_detail.*
import za.co.jacobs.mj.database.user.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:49
 */

interface DatabaseModule {
    val categoryRepository: CategoryRepository
    val orderRepository: OrderRepository
    val orderDetailRepository: OrderDetailRepository
    val productRepository: ProductRepository
    val productDetailRepository: ProductDetailRepository
    val storeRepository: StoreRepository
    val storeDetailRepository: StoreDetailRepository
    val userRepository: UserRepository
}