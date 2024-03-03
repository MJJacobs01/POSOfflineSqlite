package za.co.jacobs.mj.database.product_detail

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:47
 */

interface ProductDetailRepository {
    
    suspend fun insertProductDetail(productDetail: ProductDetail)
    
    suspend fun deleteProductDetail(productDetailId: Long)
    
    suspend fun getProductDetailByProductDetailId(productDetailId: Long): ProductDetail?
    
    suspend fun getProductDetailByProductId(productId: String): ProductDetail?
}