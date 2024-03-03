package za.co.jacobs.mj.database.product

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:41
 */

class ProductRepositoryImpl(
    private val productDao: ProductDao
) : ProductRepository {
    override suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product = product)
    }
    
    override suspend fun deleteProduct(productId: String) {
        val product = productDao.getProductByProductId(productId = productId)
        product?.let {
            productDao.deleteProduct(product = it)
        }
    }
    
    override suspend fun getProductByProductId(productId: String): Product? {
        return productDao.getProductByProductId(productId = productId)
    }
    
    override fun getAllProducts(): Flow<List<Product?>> {
        return productDao.getAllProducts()
    }
}