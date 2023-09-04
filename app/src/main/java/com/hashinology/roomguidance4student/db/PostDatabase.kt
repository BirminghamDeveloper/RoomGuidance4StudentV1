package com.hashinology.roomguidance4student.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hashinology.roomguidance4student.model.PostModel

@Database(
    entities = [PostModel::class],
    version = 1
)
abstract class PostDatabase(
    private val doa: PostDao
): RoomDatabase() {
    var instance: PostDatabase? = null
    fun getInstance(context: Context): PostDatabase{
        if (instance == null)
            synchronized(PostDatabase::class){
                instance = buildRoomDb(context)
            }
        return instance!!
    }

    private fun buildRoomDb(context: Context) =
        Room.databaseBuilder(
            context.applicationContext,
            PostDatabase::class.java,
            "posts_database"
        )
            .fallbackToDestructiveMigration()
            .build()
}