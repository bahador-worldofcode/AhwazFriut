package com.example.ahwazfriut

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.user_wellcome.*


class UserWellCome:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_wellcome)


        btn_sing_up.setOnClickListener {

            val btn : Button = it.findViewById(R.id.btn_sing_up)
            val actiona : Animation = AnimationUtils.loadAnimation(this , R.anim.anim_for_btn_zoom_out)
            btn.startAnimation(actiona)

            startActivity(Intent(this, UserSignupPage::class.java))
        }

        btn_sing_in.setOnClickListener {

            val btn : Button = it.findViewById(R.id.btn_sing_in)
            val actionb :Animation = AnimationUtils.loadAnimation(this , R.anim.anim_for_btn_zoom_out)
            btn.startAnimation(actionb)
            startActivity(Intent(this , SigninPage::class.java ))

        }





        }

    }
