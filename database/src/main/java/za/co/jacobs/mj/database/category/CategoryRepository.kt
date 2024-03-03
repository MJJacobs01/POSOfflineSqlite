package za.co.jacobs.mj.database.category

import kotlinx.coroutines.flow.*
import za.co.jacobs.mj.database.order.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:08
 */

interface CategoryRepository {
    
    suspend fun insertCategory(category: Category)
    
    suspend fun deleteCategory(categoryId: String)
    
    fun getAllCategories(): Flow<List<Category?>>
    
    suspend fun getCategoryById(categoryId: String): Category?
    
    fun getAllCategoriesByStoreId(storeId: String): Flow<List<Category?>>
}