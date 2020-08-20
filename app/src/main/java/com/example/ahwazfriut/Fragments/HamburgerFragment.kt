package com.example.ahwazfriut.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.ahwazfriut.R
import kotlinx.android.synthetic.main.hamburger_fragmet.*


class HamburgerFragment:Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.hamburger_fragmet, container, false)




        val lastremain : TextView = view.findViewById(R.id.last_orders)
        val choose : TextView = view.findViewById(R.id.choose_address)
        val increase : TextView = view.findViewById(R.id.increase_remaining)
        val support : TextView = view.findViewById(R.id.support)
        val exit : TextView = view.findViewById(R.id.exit)

        val anim : Animation = AnimationUtils.loadAnimation(activity , R.anim.anim_for_buttons_zoom_in)

        lastremain.setOnClickListener {

            lastremain.startAnimation(anim)

             fragmentManager!!.beginTransaction()
                .replace(R.id.hambuerger_container, LastOrderFragment())
                .addToBackStack(null)
                .commit()




        }
        choose.setOnClickListener {

            choose.startAnimation(anim)
        }
        increase.setOnClickListener {

            increase.startAnimation(anim)
        }
        support.setOnClickListener {

            support.startAnimation(anim)
        }
        exit.setOnClickListener {

            exit.startAnimation(anim)
        }

        return view
    }

}









