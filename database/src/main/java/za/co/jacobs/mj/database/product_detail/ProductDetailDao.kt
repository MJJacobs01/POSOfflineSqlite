package za.co.jacobs.mj.database.product_detail

import androidx.room.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:47
 */

@Dao
interface ProductDetailDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProductDetail(productDetail: ProductDetail)
    
    @Delete
    suspend fun deleteProductDetail(productDetail: ProductDetail)
    
    @Query("select * from productdetail where productId =:productId")
    suspend fun getProductDetailByProductId(productId: String): ProductDetail?
}