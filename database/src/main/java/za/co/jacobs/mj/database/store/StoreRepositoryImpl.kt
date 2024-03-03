package za.co.jacobs.mj.database.store

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 14:55
 */

class StoreRepositoryImpl(
    private val storeDao: StoreDao
) : StoreRepository {
    override suspend fun insertStore(store: Store) {
        storeDao.insertStore(store = store)
    }
    
    override suspend fun deleteStore(storeId: String) {
        val store = storeDao.getStoreByStoreId(storeId = storeId)
        store?.let {
            storeDao.deleteStore(store = it)
        }
    }
    
    override fun getAllStores(): Flow<List<Store?>> {
        return storeDao.getAllStores()
    }
    
    override suspend fun getStoreByStoreId(storeId: String): Store? {
        return storeDao.getStoreByStoreId(storeId = storeId)
    }
    
    override suspend fun getStoreByStoreName(storeName: String): Store? {
        return storeDao.getStoreByStoreName(storeName = storeName)
    }
}