package com.example.imageslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.imageslider.R.drawable.*
import com.example.imageslider.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    var image = arrayOf(gif1,gif2,gif3,gif4,gif5,gif6)
//    var titles = arrayOf("CHATS","STATUS","CALLS")
//    var frags = arrayOf(ChatFragment(),StatusFragment(),CallFragment())



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pagers.adapter = PhotosAdapter(image)

    }
}