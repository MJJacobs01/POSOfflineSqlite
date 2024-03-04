package za.co.jacobs.mj.database.store_detail

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:02
 */

class StoreDetailRepositoryImpl(
    private val storeDetailDao: StoreDetailDao
) : StoreDetailRepository {
    override suspend fun insertStoreDetail(storeDetail: StoreDetail) {
        storeDetailDao.insertStoreDetail(storeDetail = storeDetail)
    }
    
    override suspend fun deleteStoreDetail(storeDetailId: Int) {
        val storeDetail = storeDetailDao.getStoreDetailByStoreDetailId(storeDetailId = storeDetailId)
        storeDetail?.let {
            storeDetailDao.deleteStoreDetail(storeDetail = it)
        }
    }
    
    override suspend fun getStoreDetailByStoreDetailId(storeDetailId: Int): StoreDetail? {
        return storeDetailDao.getStoreDetailByStoreDetailId(storeDetailId = storeDetailId)
    }
    
    override suspend fun getStoreDetailByStoreId(storeId: Int): StoreDetail? {
        return storeDetailDao.getStoreDetailByStoreId(storeId = storeId)
    }
}