package org.sussanacode.productapi.holderNadapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.sussanacode.mvvmapplication.api.Product
import org.sussanacode.mvvmapplication.databinding.HolderProductBinding


class ProductHolder (val binding: HolderProductBinding): RecyclerView.ViewHolder(binding.root){

   fun productBind(product: Product){
      binding.tvproductid.text = "Product_id: ${product.product_id}"
       binding.tvproductname.text = "name: ${product.name}"
       binding.tvproductdesc.text = "description: ${product.description}"
       binding.tvproductcategory.text = "category: ${product.category}"
       binding.tvproductprice.text = "price: ${product.price}"
   }
}