package com.example.ahwazfriut.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ahwazfriut.Adapters.RecyclerAdapterCart
import com.example.ahwazfriut.HomeActivity
import com.example.ahwazfriut.R
import com.example.ahwazfriut.ViewModelLiveData.ViewModelPassItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.cart_fragment.view.*
import kotlinx.android.synthetic.main.cart_fragment.view.home_icon_cart


class Cart_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewitem = inflater.inflate(R.layout.cart_fragment, container, false)


        val choosebtn: Button = viewitem.findViewById(R.id.choose_titme_and_submit_order_btn)
        choosebtn.visibility = View.GONE


        val rl_cart = viewitem.findViewById<RecyclerView>(R.id.recycler_view_cart)
        rl_cart.visibility = View.GONE


        val navbar: BottomNavigationView = activity!!.findViewById(R.id.nav_view_bottom_main)
        navbar.visibility = View.GONE

        val homeicon: ImageButton = viewitem.home_icon_cart
        homeicon.setOnClickListener {

            activity?.let {

                val intent = Intent(requireContext(), HomeActivity::class.java)
                it.startActivity(intent)

            }
        }

        viewitem.start_shopping_in_cart.setOnClickListener {

            activity?.let {

                val intent = Intent(requireContext(), HomeActivity::class.java)
                it.startActivity(intent)


            }


        }

        return viewitem
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val titlename = view.findViewById<TextView>(R.id.show_empty_cart)


        val viewmodel = ViewModelProviders.of(activity!!).get(ViewModelPassItem::class.java)


        viewmodel.pass.observe(activity!! , Observer {

            if (it != null){
                val rl_cart = view.findViewById<RecyclerView>(R.id.recycler_view_cart)
                rl_cart.visibility = View.VISIBLE

                val txt_show = view.findViewById<TextView>(R.id.show_empty_cart)
                txt_show.visibility = View.GONE

                val start_shoppimg = view.findViewById<TextView>(R.id.start_shopping_in_cart)
                start_shoppimg.visibility = View.GONE

            view.recycler_view_cart.apply {


                layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, true)
                adapter = RecyclerAdapterCart(it)
            }

        }


        })

    }
}