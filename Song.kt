package com.example.musicplayerapp


import android.graphics.drawable.Drawable

class Song(title:String,artist:String,thumbnail:Int,audio:Int,category:String,id:Int ) {


    var title:String?=null
    var artist:String?=null
    var thumbnail:Int
    var audio:Int
    var category:String=""
    var id:Int

    init {
        this.title=title
        this.artist=artist
        this.thumbnail=thumbnail
        this.audio=audio
        this.category=category
        this.id=id

    }


}