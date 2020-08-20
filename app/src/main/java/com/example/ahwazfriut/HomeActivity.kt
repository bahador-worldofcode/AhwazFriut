package com.example.ahwazfriut

import android.app.Activity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ahwazfriut.Adapters.RecyclerAdapterMain
import com.example.ahwazfriut.Fragments.*
import com.example.ahwazfriut.Models.ModelProductMain
import kotlinx.android.synthetic.main.home_activity.*


class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)


        val list = ArrayList<ModelProductMain>()

        for (i in 0..20) {

            list.add(ModelProductMain("موز 1 کیلویی", 12.000, R.drawable.bannana))

        }




        recycler_main.apply {

            layoutManager = GridLayoutManager(this@HomeActivity, 2)
            adapter = RecyclerAdapterMain(list)


        }





        nav_view_bottom_main.setOnNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.home -> {

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.homepage, Home_fragment())
                        .commit()
                }

                R.id.search -> {

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.homepage, Search_Frament())
                        .commit()

                }

                R.id.cart -> {

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.homepage, Cart_Fragment())
                        .commit()
                }
            }

            true
        }


        btn_image_humberger_icon.setOnClickListener {


            supportFragmentManager.beginTransaction()
                .replace(R.id.homepage, HamburgerFragment())
                .commit()


        }


    }


}



