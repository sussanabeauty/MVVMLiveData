package org.sussanacode.mvvmapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ScrollView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import org.sussanacode.mvvmapplication.api.Product
import org.sussanacode.mvvmapplication.databinding.ActivityMainBinding
import org.sussanacode.mvvmapplication.modelview.ProductViewModel
import org.sussanacode.productapi.holderNadapter.ProductAdapter


//Observable: It is something which will emit the data.
//Observer: It is something which will listen to data emitted by the obervable
//LiveData is an observable data holder class. It is lifecycle aware.

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var productAdapter: ProductAdapter
    var products: ArrayList<Product>? = null

    //val viewModel: MainViewModel by viewModels()

    private val viewModel: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


      //  viewModel.getAllProduct()
       // val productliveData = viewModel.livedataObserver


        viewModel.emitProductValue().observe(this, Observer {

//            binding.tvProductData.setText(it.toString())

            binding.tvProductData.text = "\n${it.toString()}"

        })


//        viewModel.emitValue1()
//        viewModel.emitValue2()
//        viewModel.emitValue3()
//
//        val liveData = viewModel.livedataObserver
//
//        liveData.observe(this, Observer {
//            Toast.makeText(baseContext, it, Toast.LENGTH_LONG).show()
//            Log.d("View Model", it)
//        })
    }
}