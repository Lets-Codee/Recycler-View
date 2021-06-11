package com.tech.twister.recyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapterGrid(fName:List<String>,parentContext:Context): RecyclerView.Adapter<GroupViewHolderGrid>() {

    var folderName: List<String> = fName
    var context:Context=parentContext

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolderGrid {
        val view=LayoutInflater.from(context).inflate(R.layout.list_item_grid,parent,false)
        return (GroupViewHolderGrid(view))
    }

    override fun onBindViewHolder(holder: GroupViewHolderGrid, position: Int) {
        holder.mTextView.text= folderName[position]
    }

    override fun getItemCount(): Int {
        return folderName.size
    }
}

class GroupViewHolderGrid(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var mTextView: TextView = itemView.findViewById(R.id.folder_name)

}