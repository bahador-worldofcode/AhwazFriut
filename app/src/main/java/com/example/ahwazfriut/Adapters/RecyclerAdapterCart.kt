package com.example.ahwazfriut.Adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ahwazfriut.Models.ModelProductMain
import com.example.ahwazfriut.R
import com.squareup.picasso.Picasso

class RecyclerAdapterCart(private val modelproductcart : ArrayList<ModelProductMain>) : RecyclerView.Adapter<RecyclerAdapterCart.ViewHolder>() {


    class ViewHolder (itemview : View) : RecyclerView.ViewHolder(itemview) {

        val title = itemview.findViewById<TextView>(R.id.items_cart_title)
        val price = itemview.findViewById<TextView>(R.id.price_items_choose_by_user)
        val image = itemview.findViewById<ImageView>(R.id.image_items_cart)





    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vh = LayoutInflater.from(parent.context).inflate(R.layout.cart_items_recycleradapter , parent , false)
        return ViewHolder(vh)

    }

    override fun getItemCount() = modelproductcart.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val productcart = modelproductcart[position]


        holder.title.text = productcart.title
        holder.price.text = productcart.price.toString()
        Picasso.get().load(productcart.image).into(holder.image)


    }

}
