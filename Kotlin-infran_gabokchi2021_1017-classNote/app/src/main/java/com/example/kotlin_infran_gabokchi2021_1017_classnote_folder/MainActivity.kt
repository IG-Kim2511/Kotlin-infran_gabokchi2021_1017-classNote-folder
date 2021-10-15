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

            val intent = Intent(this, sample2_Activity::class.java)
            startActivity(intent)
        }

//        🍀110. 7개 image들의 이름 만들고, 각각 클릭때, 다른 activity로 이동
        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        image2.setOnClickListener {
            Toast.makeText(this, "number 2 click" , Toast.LENGTH_SHORT).show()

            val intent = Intent(this, sample3_Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            Toast.makeText(this, "number 3 click" , Toast.LENGTH_SHORT).show()

            val intent = Intent(this, sample4_Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            Toast.makeText(this, "number 4 click" , Toast.LENGTH_SHORT).show()

            val intent = Intent(this, sample5_Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            Toast.makeText(this, "number 5 click" , Toast.LENGTH_SHORT).show()

            val intent = Intent(this, sample6_Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            Toast.makeText(this, "number 6 click" , Toast.LENGTH_SHORT).show()

            val intent = Intent(this, sample7_Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            Toast.makeText(this, "number 7 click" , Toast.LENGTH_SHORT).show()

            val intent = Intent(this, sample8_Activity::class.java)
            startActivity(intent)
        }

    }
}