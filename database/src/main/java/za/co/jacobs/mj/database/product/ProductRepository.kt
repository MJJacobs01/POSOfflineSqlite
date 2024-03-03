package za.co.jacobs.mj.database.product

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:41
 */

interface ProductRepository {
    
    suspend fun insertProduct(product: Product)
    
    suspend fun deleteProduct(productId: String)
    
    suspend fun getProductByProductId(productId: String): Product?
    
    fun getAllProducts(): Flow<List<Product?>>
}