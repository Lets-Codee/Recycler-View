package com.tech.twister.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GridRecyclerView : AppCompatActivity() {
    //Variables
    lateinit var recyclerView: RecyclerView
    lateinit var folderName: List<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_recycler_view)

        //Initialization
        recyclerView=findViewById(R.id.recycler_view_grid)
        folderName= listOf("Android","Android Studio","Java","Kotlin","Xml","C++","C","Python","HTML","CSS","Javascript","React","Wordpress")

        //Set Adapter
        val customAdapter=CustomAdapterGrid(folderName,this)
        recyclerView.adapter=customAdapter

        //For Grid View of list item
        val gridManager:RecyclerView.LayoutManager= GridLayoutManager(this,2)
        recyclerView.layoutManager=gridManager

    }
}