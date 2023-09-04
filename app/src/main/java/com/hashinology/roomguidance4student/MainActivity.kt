package com.hashinology.roomguidance4student

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hashinology.roomguidance4student.db.PostDatabase

class MainActivity : AppCompatActivity() {
    lateinit var postDatabase: PostDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postDatabase = PostDatabase().getInstance(this)
        

    }
}