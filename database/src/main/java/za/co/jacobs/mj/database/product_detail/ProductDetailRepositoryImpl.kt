package za.co.jacobs.mj.database.product_detail

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:47
 */

class ProductDetailRepositoryImpl(
    private val productDetailDao: ProductDetailDao
) : ProductDetailRepository {
    override suspend fun insertProductDetail(productDetail: ProductDetail) {
        productDetailDao.insertProductDetail(productDetail = productDetail)
    }
    
    override suspend fun deleteProductDetail(productDetailId: Long) {
        val productDetail = productDetailDao.getProductDetailByProductDetailId(productDetailId = productDetailId)
        productDetail?.let {
            productDetailDao.deleteProductDetail(productDetail = it)
        }
    }
    
    override suspend fun getProductDetailByProductDetailId(productDetailId: Long): ProductDetail? {
        return productDetailDao.getProductDetailByProductDetailId(productDetailId = productDetailId)
    }
    
    override suspend fun getProductDetailByProductId(productId: String): ProductDetail? {
        return productDetailDao.getProductDetailByProductId(productId = productId)
    }
}