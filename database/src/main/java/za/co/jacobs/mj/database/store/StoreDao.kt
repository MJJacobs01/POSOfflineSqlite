package za.co.jacobs.mj.database.store

import androidx.room.*
import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:55
 */

@Dao
interface StoreDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStore(store: Store)
    
    @Delete
    suspend fun deleteStore(store: Store)
    
    @Query("select * from store order by storeName asc")
    fun getAllStores(): Flow<List<Store?>>
    
    @Query("select * from store where storeId =:storeId")
    suspend fun getStoreByStoreId(storeId: String): Store?
    
    @Query("select * from store where storeName =:storeName")
    suspend fun getStoreByStoreName(storeName: String): Store?
}