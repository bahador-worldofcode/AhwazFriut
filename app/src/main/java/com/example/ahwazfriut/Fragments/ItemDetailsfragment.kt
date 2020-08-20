package com.example.ahwazfriut.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.ahwazfriut.Models.ModelProductMain
import com.example.ahwazfriut.R
import com.example.ahwazfriut.ViewModelLiveData.ViewModelPassItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cart_items_recycleradapter.*
import kotlinx.android.synthetic.main.details_items_page.view.*

class ItemDetailsfragment : Fragment() {


    lateinit var viewmodel: ViewModelPassItem

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.details_items_page, container, false)

        val title = arguments?.getString("title")
        view.title_details_item.text = title

        val price = arguments?.getString("price")
        view.price_item_details.text = price

        val image = arguments?.getString("image")
        Picasso.get().load(image).into(view.image_items_detail)

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val model = ArrayList<ModelProductMain>()

        model.add(ModelProductMain("bahador khan" , 12.12  , R.drawable.bannana))

        viewmodel = ViewModelProviders.of(activity!!).get(ViewModelPassItem::class.java)


        view.plus_icon_item_details.setOnClickListener {

        viewmodel.passdata(model)


        }



    }
}
