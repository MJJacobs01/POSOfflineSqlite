package za.co.jacobs.mj.database.store

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:55
 */

interface StoreRepository {
    
    suspend fun insertStore(store: Store)
    
    suspend fun deleteStore(storeId: String)
    
    fun getAllStores(): Flow<List<Store?>>
    
    suspend fun getStoreByStoreId(storeId: String): Store?
    
    suspend fun getStoreByStoreName(storeName: String): Store?
}