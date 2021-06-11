package com.tech.twister.recyclerviewdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //Variables
    lateinit var linearRV:Button
    lateinit var gridRV:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //Initialization
        linearRV=findViewById(R.id.linear_rv)
        gridRV=findViewById(R.id.grid_rv)

        linearRV.setOnClickListener {
            val intent=Intent(this,LinearRecyclerView::class.java)
            startActivity(intent)
        }
        gridRV.setOnClickListener {
            val intent=Intent(this,GridRecyclerView::class.java)
            startActivity(intent)
        }

    }
}