package za.co.jacobs.mj.database.product_detail

import androidx.room.*
import androidx.room.ColumnInfo.Companion.BLOB

@Entity
data class ProductDetail(
    @PrimaryKey(autoGenerate = true)
    val productDetailId: Long,
    val productId: String,
    val name: String,
    val priceBuy: Double,
    val priceSell: Double,
    val qty: Int,
    val description: String,
    @ColumnInfo(typeAffinity = BLOB)
    val image: ByteArray
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        
        other as ProductDetail
        
        return image.contentEquals(other.image)
    }
    
    override fun hashCode(): Int {
        return image.contentHashCode()
    }
}
