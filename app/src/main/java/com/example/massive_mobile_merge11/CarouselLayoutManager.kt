package com.example.massive_mobile_merge11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CarouselActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val images = listOf(
            R.drawable.slide1,
            R.drawable.slide2
        )

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        val adapter = CarouselAdapter(this, images)
        recyclerView.adapter = adapter
    }
}
