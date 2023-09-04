package com.hashinology.roomguidance4student.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "post_table")
data class PostModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val userId: Int,
    var title: String,
    var body: String
)
