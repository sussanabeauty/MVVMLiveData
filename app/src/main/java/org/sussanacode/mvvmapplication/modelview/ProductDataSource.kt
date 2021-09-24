package org.sussanacode.mvvmapplication.modelview

import android.util.Log
import androidx.lifecycle.MutableLiveData
import org.sussanacode.mvvmapplication.api.APIClient
import org.sussanacode.mvvmapplication.api.ProductResponseData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductDataSource {

    fun getAllProduct(): MutableLiveData<ProductResponseData> {

        val callbacklist = APIClient.apiService.getProducts()
        var livedataObserver: MutableLiveData<ProductResponseData> = MutableLiveData()


        callbacklist.enqueue(object: Callback<ProductResponseData> {
            override fun onResponse(
                call: Call<ProductResponseData>,
                response: Response<ProductResponseData>
            ) {
                if(!response.isSuccessful){
                    Log.d("Product Response Failed" ,"Failed to retrieve data. Error: ${call.toString()}")
                }


                val data = response.body()
                livedataObserver.value = data

                //Log.d("Product Response:", data.toString())
            }

            override fun onFailure(call: Call<ProductResponseData>, t: Throwable) {
                t.printStackTrace()
                Log.d("Product Response Error" ,"error whiles retrieving data. Error: ${call.toString()}")

            }
        })

        return livedataObserver

    }
}