package com.example.musicplayerapp

import androidx.lifecycle.ViewModel

class AudioViewModel : ViewModel(){


    var songs= listOf<Song>(
    Song("Haniya Ve","Jubin Nautiyal",R.drawable.haniyave,R.raw.haniyave,"Hindi",1),
    Song("Manike","Jubin Nautiyal",R.drawable.manike,R.raw.manike,"Hindi",2),
    Song("Om shivaay","Shankar",R.drawable.ramsetu,R.raw.om,"Hindi",3),
    Song("O Sajna","Neha Kakkar",R.drawable.osajna,R.raw.osajna,"Hindi",4),
    Song("Tum Mere","Darshan Raval",R.drawable.song2,R.raw.tummere,"Hindi",5),
    Song("Ghost","Justin Bieber",R.drawable.justin,R.raw.ghost,"English",6),
    Song("Ice Cream","Black Pink",R.drawable.icecream,R.raw.jennie,"Korean",7),
    Song("Lemonade","Diljit Dosainjh",R.drawable.lemon,R.raw.lemonade,"Punjabi",8),


)
 var categories = listOf<String>(
     "Hindi","Punjabi","English","Korean"
 )

}