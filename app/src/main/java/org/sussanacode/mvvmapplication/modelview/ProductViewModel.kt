package org.sussanacode.mvvmapplication.modelview

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.sussanacode.mvvmapplication.api.APIClient
import org.sussanacode.mvvmapplication.api.Product
import org.sussanacode.mvvmapplication.api.ProductResponseData
import org.sussanacode.mvvmapplication.repository.ProductRepo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class ProductViewModel() : ViewModel() {

    var livedata: MutableLiveData<ProductResponseData> = MutableLiveData()
    var flag: Boolean = true

    fun emitProductValue(): MutableLiveData<ProductResponseData> {
        if(flag){
            livedata = ProductRepo().getAllProduct()

            flag = false
        }

        return livedata

    }

}