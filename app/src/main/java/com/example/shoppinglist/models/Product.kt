package com.example.shoppinglist.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
class Product(
    @ColumnInfo(name = "quantity")
    val quantity: Int,

    @ColumnInfo(name = "name")
    val name: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)