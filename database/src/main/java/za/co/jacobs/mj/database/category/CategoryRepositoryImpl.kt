package za.co.jacobs.mj.database.category

import kotlinx.coroutines.flow.*
import za.co.jacobs.mj.database.order.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:08
 */

class CategoryRepositoryImpl(
    private val categoryDao: CategoryDao
) : CategoryRepository {
    override suspend fun insertCategory(category: Category) {
        categoryDao.insertCategory(category = category)
    }
    
    override suspend fun deleteCategory(categoryId: String) {
        val category = categoryDao.getCategoryById(categoryId = categoryId)
        category?.let {
            categoryDao.deleteCategory(category = it)
        }
    }
    
    override fun getAllCategories(): Flow<List<Category?>> {
        return categoryDao.getAllCategories()
    }
    
    override suspend fun getCategoryById(categoryId: String): Category? {
        return categoryDao.getCategoryById(categoryId = categoryId)
    }
    
    override fun getAllCategoriesByStoreId(storeId: String): Flow<List<Category?>> {
        return categoryDao.getAllCategoriesByStoreId(storeId = storeId)
    }
}