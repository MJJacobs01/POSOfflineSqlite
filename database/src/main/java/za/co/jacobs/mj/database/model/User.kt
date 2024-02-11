package za.co.jacobs.mj.database.model

import androidx.room.*

@Entity(indices = [Index(value = ["email"], unique = true)])
data class User(
    @PrimaryKey(autoGenerate = false)
    val username: String,
    val name: String,
    val email: String,
    val level: String,
    val createdAt: Long = System.currentTimeMillis(),
    val password: String,
    val secretKey: String,
)
