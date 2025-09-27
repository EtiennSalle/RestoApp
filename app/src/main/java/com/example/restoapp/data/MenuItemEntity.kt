package com.example.restoapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menu_items")
data class MenuItemEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val restaurantId: Long,
    val name: String,
    val description: String?,
    val priceCents: Int,
    val imageUrl: String?,
    val available: Boolean = true
)
