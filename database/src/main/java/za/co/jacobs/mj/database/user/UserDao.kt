package za.co.jacobs.mj.database.user

import androidx.room.*
import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:09
 */

@Dao
interface UserDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)
    
    @Delete
    suspend fun deleteUser(user: User)
    
    @Query("select * from user where username =:username")
    suspend fun getUserByUsername(username: String): User?
    
    @Query("select * from user where email =:email")
    suspend fun getUserByEmail(email: String): User?
    
    @Query("select * from user where level =:level order by createdAt desc")
    fun getUsersByLevel(level: String): Flow<List<User?>>
    
    @Query("select * from user where isUserActive =:isUserActive")
    fun getUsersByActiveStatus(isUserActive: Boolean): Flow<List<User?>>
}