package org.sussanacode.mvvmapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.quicksettings.TileService
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import org.sussanacode.mvvmapplication.api.APIClient
import org.sussanacode.mvvmapplication.api.Product
import org.sussanacode.mvvmapplication.api.ProductResponseData
import org.sussanacode.mvvmapplication.databinding.ActivityProductBinding
import org.sussanacode.mvvmapplication.modelview.ProductViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProductActivity : AppCompatActivity() {

//    lateinit var binding: ActivityProductBinding
//    val viewModel: ProductViewModel by viewModels()
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityProductBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        viewModel.getAllProduct()
//
//
//       val productliveData = viewModel.livedataObserver
//
//        productliveData.observe(this, Observer {
//           // Toast.makeText(baseContext, it.toString(), Toast.LENGTH_LONG).show()
//            Log.d("View Model", it.toString())
//        })
//    }

}