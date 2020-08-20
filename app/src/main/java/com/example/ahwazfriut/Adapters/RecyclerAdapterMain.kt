package com.example.ahwazfriut.Adapters


import android.content.ClipData
import android.os.Bundle
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.ahwazfriut.Fragments.ItemDetailsfragment
import com.example.ahwazfriut.HomeActivity
import com.example.ahwazfriut.Models.ModelProductMain
import com.example.ahwazfriut.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.product_items.view.*
import java.lang.Appendable


class RecyclerAdapterMain(
    val product: ArrayList<ModelProductMain>

) :
    RecyclerView.Adapter<RecyclerAdapterMain.ViewHolder>() {


    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {


        val title: TextView = itemview.product_txt
        val price: TextView = itemview.price_product
        val imageproduct: ImageView = itemview.product_image
        val addicon: ImageButton = itemview.image_icon_add


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val layoutview =
            LayoutInflater.from(parent.context).inflate(R.layout.product_items, parent, false)

        return ViewHolder(layoutview)

    }


    override fun getItemCount() = product.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val products = product[position]
        holder.title.text = products.title
        holder.price.text = products.price.toString()
        Picasso.get().load(products.image).into(holder.imageproduct)


        holder.itemView.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("title", products.title)
            bundle.putString("price", products.price.toString())
            bundle.putString("image", products.image.toString())


            val myfragment = ItemDetailsfragment()
            myfragment.arguments = bundle


            val activity = it.context as AppCompatActivity
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.homepage, myfragment)
                .commit()


        }

        holder.addicon.setOnClickListener {


            val animation : Animation = AnimationUtils.loadAnimation(it.context , R.anim.anim_add_icon)
            it.startAnimation(animation)

        }


    }


}















