package za.co.jacobs.mj.database.user

import kotlinx.coroutines.flow.*

/**
 * Created by MJ Jacobs on 2024/03/03 at 15:09
 */

class UserRepositoryImpl(
    private val userDao: UserDao
) : UserRepository {
    override suspend fun insertUser(user: User) {
        userDao.insertUser(user = user)
    }
    
    override suspend fun deleteUser(username: String) {
        val user = userDao.getUserByUsername(username = username)
        user?.let {
            userDao.deleteUser(user = it)
        }
    }
    
    override suspend fun getUserByUsername(username: String): User? {
        return userDao.getUserByUsername(username = username)
    }
    
    override suspend fun getUserByEmail(email: String): User? {
        return userDao.getUserByEmail(email = email)
    }
    
    override fun getUserByLevel(level: String): Flow<List<User?>> {
        return userDao.getUsersByLevel(level = level)
    }
    
    override fun getUsersByActiveStatus(isUserActive: Boolean): Flow<List<User?>> {
        return userDao.getUsersByActiveStatus(isUserActive = isUserActive)
    }
}