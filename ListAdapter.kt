package com.example.musicplayerapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListAdapter(val context:Context,val songs:List<Song>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val song=songs.get(position)
        holder.title.text=song.title
        holder.artist.text=song.artist
        holder.thumbnail.setImageResource(song.thumbnail)

        holder.playBtn.setOnClickListener{
            val intent=Intent(context,PlayerActivity::class.java)
            intent.putExtra("index",position.toString())
            context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return  songs.size;
    }


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){

        val title=view.findViewById<TextView>(R.id.title)
        val artist=view.findViewById<TextView>(R.id.artist)
        val thumbnail=view.findViewById<ImageView>(R.id.thumbnail)
        val playBtn=view.findViewById<FloatingActionButton>(R.id.playBtn)









    }

}



