package org.sussanacode.productapi.holderNadapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sussanacode.mvvmapplication.api.Product
import org.sussanacode.mvvmapplication.databinding.HolderProductBinding


class ProductAdapter(val productList: ArrayList<Product>?): RecyclerView.Adapter<ProductHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = HolderProductBinding.inflate(layoutInflater, parent, false)
        return ProductHolder(binding)

    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        productList?.let{
            holder.productBind(it[position])
        }

    }

    override fun getItemCount() = productList?.size?:0
}