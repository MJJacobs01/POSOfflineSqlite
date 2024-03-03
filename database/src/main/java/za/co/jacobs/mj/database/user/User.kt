package za.co.jacobs.mj.database.user

import androidx.room.*
import kotlinx.datetime.*

@Entity(indices = [Index(value = ["email"], unique = true)])
data class User(
    @PrimaryKey(autoGenerate = false)
    val username: String,
    val name: String,
    val email: String,
    val level: String,
    val createdAt: Long = Clock.System.now().epochSeconds,
    val password: String,
    val secretKey: String,
    val isUserActive: Boolean
)
