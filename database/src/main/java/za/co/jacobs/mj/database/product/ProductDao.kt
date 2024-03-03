package za.co.jacobs.mj.database.product

import androidx.room.*
import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:40
 */

@Dao
interface ProductDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(product: Product)
    
    @Delete
    suspend fun deleteProduct(product: Product)
    
    @Query("select * from product where productId =:productId")
    suspend fun getProductByProductId(productId: String): Product?
    
    @Query("select * from product order by createdAt desc")
    fun getAllProducts(): Flow<List<Product?>>
}