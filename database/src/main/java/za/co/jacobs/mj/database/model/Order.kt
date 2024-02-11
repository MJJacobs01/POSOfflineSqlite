package za.co.jacobs.mj.database.model

import androidx.room.*

@Entity
data class Order(
    @PrimaryKey(autoGenerate = false)
    val idOrder: String,     //  generate from user+timestamp
    val buyerName: String,
    val status: String,      //  done, not done
    val createdAt: Long = System.currentTimeMillis()
)
