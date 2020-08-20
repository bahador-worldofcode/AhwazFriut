package com.example.ahwazfriut

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sign_up_page.*

class UserSignupPage:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_page)



        txt_sign_in_btn.setOnClickListener {

            val txtbtn : Button = it.findViewById(R.id.txt_sign_in_btn)
            val actionbtn : Animation = AnimationUtils.loadAnimation(this , R.anim.anim_for_buttons_zoom_in)
            txtbtn.startAnimation(actionbtn)

            startActivity(Intent(this , SigninPage::class.java))

        }


    }
}