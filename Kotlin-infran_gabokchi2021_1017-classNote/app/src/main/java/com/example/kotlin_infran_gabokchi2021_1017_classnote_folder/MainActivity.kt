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

//         ๐c90. findViewbyId, toast
//        1.val ~~ = findViewById<~~>(R.id.~~~)
         val image1 = findViewById<ImageView>(R.id.bts_image_1)

//        ๐c90. when click image1, ~~~
        image1.setOnClickListener {
//            ๐c90.show text : Toast.makeText
//            Toast.makeText(, "", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "number 1 click" , Toast.LENGTH_SHORT).show()


//          ๐c100.ํ๋ฉด(์กํฐ๋นํฐ) ์๋ก ๋ง๋ค๊ธฐ, ํ๋ฉด์ ํ (intent) nextPage
//            val intent = Intent(this, ~~~~(ktํ์ผ)::class.java)
//            startActivity(intent)

            val intent = Intent(this, sample2_Activity::class.java)
            startActivity(intent)
        }

//        ๐110. 7๊ฐ image๋ค์ ์ด๋ฆ ๋ง๋ค๊ณ , ๊ฐ๊ฐ ํด๋ฆญ๋, ๋ค๋ฅธ activity๋ก ์ด๋
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