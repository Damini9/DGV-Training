package com.example.musicplayerapp

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.lifecycle.ViewModelProvider
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.musicplayerapp.R.id.recyclerView
//import com.example.musicplayerapp.R.id.recyclerView2
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val audioViewModel:AudioViewModel= ViewModelProvider(this).get(
//            AudioViewModel::class.java)
//
////        Recycler View layout
//
//        val myRecyclerView=findViewById<RecyclerView>(recyclerView)
//        myRecyclerView.layoutManager= LinearLayoutManager(this)
//
////        passing data to adapter
//        val listAdapter=ListAdapter(this, audioViewModel.songs)
//
////        connecting adapter
//        myRecyclerView.adapter=listAdapter
//    }
//}
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.mbms.MbmsErrors.InitializationErrors
import androidx.lifecycle.ViewModelProvider
//import androidx.lifecycleViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerviewwidget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mediaPlayerViewModel:AudioViewModel= ViewModelProvider(this).get(AudioViewModel::class.java)
        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        var category=intent.getStringExtra("category")
        var list = mutableListOf<Song>()
        for(i in 0 until mediaPlayerViewModel.songs.size){
            if(mediaPlayerViewModel.songs.get(i).category==category){
                list.add(mediaPlayerViewModel.songs.get(i))
            }
        }
        var listAdapter=ListAdapter(this,list)
        recyclerView.adapter=listAdapter
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
}

