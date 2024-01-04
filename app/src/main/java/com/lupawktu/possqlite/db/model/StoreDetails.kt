package com.lupawktu.possqlite.db.model

import androidx.room.*
import androidx.room.ColumnInfo.Companion.BLOB

@Entity
data class StoreDetails(
    @PrimaryKey(autoGenerate = true)
    val storeDetailId:Int,
    val storeId:String,
    val name:String,
    val address:String,
    val latitude:String,
    val longitude:String,
    val description:String,
    @ColumnInfo(typeAffinity = BLOB)
    val image:ByteArray
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        
        other as StoreDetails
        
        return image.contentEquals(other.image)
    }
    
    override fun hashCode(): Int {
        return image.contentHashCode()
    }
}
