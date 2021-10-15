package com.example.kotlin_infran_gabokchi2021_1017_classnote_folder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.content.Intent




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//         🍀c90. findViewbyId, toast
//        1.val ~~ = findViewById<~~>(R.id.~~~)
         val image1 = findViewById<ImageView>(R.id.bts_image_1)

//        🍀c90. when click image1, ~~~
        image1.setOnClickListener {
//            🍀c90.show text : Toast.makeText
//            Toast.makeText(, "", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "number 1 click" , Toast.LENGTH_SHORT).show()


//          🍀c100.화면(액티비티) 새로 만들기, 화면전환 (intent) nextPage
//            val intent = Intent(this, ~~~~(kt파일)::class.java)
//            startActivity(intent)

            val intent = Intent(this, sample_Activity2::class.java)
            startActivity(intent)


        }
//        2
    }
}