package za.co.jacobs.mj.database.category

import androidx.room.*
import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/02/11 at 12:09
 */

@Dao
interface CategoryDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: Category)
    
    @Delete
    suspend fun deleteCategory(category: Category)
    
    @Query("select * from category order by name asc")
    fun getAllCategories(): Flow<List<Category?>>
    
    @Query("select * from category where categoryId =:categoryId")
    suspend fun getCategoryById(categoryId: String): Category?
    
    @Query("select * from category where storeId =:storeId")
    fun getAllCategoriesByStoreId(storeId: String): Flow<List<Category?>>
}