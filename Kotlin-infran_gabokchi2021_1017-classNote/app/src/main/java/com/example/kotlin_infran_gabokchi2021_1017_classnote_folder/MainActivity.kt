package com.example.kotlin_infran_gabokchi2021_1017_classnote_folder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        c90. findViewbyId, toast
//        1.val ~~ = findViewById<~~>(R.id.~~~)
         val image1 = findViewById<ImageView>(R.id.bts_image_1)

        image1.setOnClickListener {
//            Toast.makeText(, "", Toast.LENGTH_SHORT).show()

            Toast.makeText(this, "number 1 click" , Toast.LENGTH_SHORT).show()

//            Toast.makeText(, "number 1", Toast.LENGTH_SHORT).show()
        }
//        2
    }
}