package za.co.jacobs.mj.database.dao

import androidx.room.*
import kotlinx.coroutines.flow.*
import za.co.jacobs.mj.database.model.Category

/**
 * Created by MJ Jacobs on 2024/02/11 at 12:09
 */

@Dao
interface CategoryDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: Category)
    
    @Delete
    suspend fun deleteCategory(idCategory: String)
    
    @Query("select * from category order by name asc")
    fun getAllCategories(): Flow<List<Category?>>
}