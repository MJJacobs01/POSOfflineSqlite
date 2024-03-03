package za.co.jacobs.mj.database.user

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:09
 */

interface UserRepository {
    
    suspend fun insertUser(user: User)
    
    suspend fun deleteUser(username: String)
    
    suspend fun getUserByUsername(username: String): User?
    
    suspend fun getUserByEmail(email: String): User?
    
    fun getUserByLevel(level: String): Flow<List<User?>>
    
    fun getUsersByActiveStatus(isUserActive: Boolean): Flow<List<User?>>
}