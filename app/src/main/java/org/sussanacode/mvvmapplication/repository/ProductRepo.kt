package org.sussanacode.mvvmapplication.repository

import androidx.lifecycle.MutableLiveData
import org.sussanacode.mvvmapplication.api.ProductResponseData
import org.sussanacode.mvvmapplication.modelview.ProductDataSource

class ProductRepo {

    fun getAllProduct(): MutableLiveData<ProductResponseData> {
        return ProductDataSource().getAllProduct()
    }


}