package za.co.jacobs.mj.database.store_detail

import androidx.room.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:02
 */

@Dao
interface StoreDetailDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStoreDetail(storeDetail: StoreDetail)
    
    @Delete
    suspend fun deleteStoreDetail(storeDetail: StoreDetail)
    
    @Query("select * from storedetail where storeDetailId =:storeDetailId")
    suspend fun getStoreDetailByStoreDetailId(storeDetailId: Int): StoreDetail?
    
    @Query("select * from storedetail where storeId =:storeId")
    suspend fun getStoreDetailByStoreId(storeId: Int): StoreDetail?
}