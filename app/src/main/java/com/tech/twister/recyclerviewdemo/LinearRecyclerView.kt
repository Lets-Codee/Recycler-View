package com.tech.twister.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LinearRecyclerView : AppCompatActivity() {
    //Variables
    lateinit var recyclerView: RecyclerView
    lateinit var folderName: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_recycler_view)

        //Initialization
        recyclerView=findViewById(R.id.recycler_view)
        folderName= listOf("Android","Android Studio","Java","Kotlin","Xml","C++","C","Python","HTML","CSS","Javascript","React","Wordpress")

        //Set Adapter
        val customAdapter=CustomAdapter(folderName,this)
        recyclerView.adapter=customAdapter

        //Layout Manager

        //For linear layout of list item
        val manager:RecyclerView.LayoutManager= LinearLayoutManager(this)


        recyclerView.layoutManager=manager
    }
}