package za.co.jacobs.mj.database.store_detail

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:02
 */

interface StoreDetailRepository {
    
    suspend fun insertStoreDetail(storeDetail: StoreDetail)
    
    suspend fun deleteStoreDetail(storeDetailId: Int)
    
    suspend fun getStoreDetailByStoreDetailId(storeDetailId: Int): StoreDetail?
    
    suspend fun getStoreDetailByStoreId(storeId: Int): StoreDetail?
}