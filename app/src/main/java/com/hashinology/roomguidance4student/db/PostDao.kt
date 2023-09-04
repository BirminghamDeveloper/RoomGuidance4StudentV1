package com.hashinology.roomguidance4student.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.hashinology.roomguidance4student.model.PostModel
@Dao
interface PostDao {
    @Upsert()
    suspend fun upsertPost(postModel: PostModel)
    @Delete
    suspend fun deletePost(postModel: PostModel)
    @Query("SELECT * FROM post_table")
    fun getPost(): List<PostModel>
}