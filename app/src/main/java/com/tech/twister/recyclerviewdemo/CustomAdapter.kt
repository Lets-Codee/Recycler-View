package com.tech.twister.recyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(fName:List<String>,parentContext:Context): RecyclerView.Adapter<GroupViewHolder>() {

    var folderName: List<String> = fName
    var context:Context=parentContext

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return (GroupViewHolder(view))
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        holder.mTextView.text= folderName[position]
    }

    override fun getItemCount(): Int {
        return folderName.size
    }
}

class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var mTextView: TextView = itemView.findViewById(R.id.folder_name)

}