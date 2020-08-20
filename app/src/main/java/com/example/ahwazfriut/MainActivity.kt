package com.example.ahwazfriut

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ahwazfriut.Adapters.RecyclerAdapterMain
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()  {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_go_to_sign_up.setOnClickListener {
            val intent = Intent(this , UserWellCome::class.java)
            startActivity(intent)
        }


        btn_home_activity.setOnClickListener {


            startActivity(Intent(this, HomeActivity::class.java))

        }

        }


}



