package com.example.restoapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy   // ⚡ manquait
import androidx.room.Query
import kotlinx.coroutines.flow.Flow      // ⚡ manquait

@Dao
interface MenuItemDao {
    @Query("SELECT * FROM menu_items WHERE restaurantId = :rid")
    fun observeByRestaurant(rid: Long): Flow<List<MenuItemEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: MenuItemEntity)

    @Delete
    suspend fun delete(item: MenuItemEntity)
}
