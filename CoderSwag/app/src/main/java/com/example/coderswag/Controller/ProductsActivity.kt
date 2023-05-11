package com.example.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.ProductAdapter
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilitites.EXTRA_CATEGORY
import com.example.coderswag.databinding.ActivityMainBinding
import com.example.coderswag.databinding.ActivityProductsBinding

class ProductsActivity : AppCompatActivity() {
    var binding: ActivityProductsBinding?=null

    lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_products)

        //setting up the view binding
        binding= ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val categoryType=intent.getStringExtra(EXTRA_CATEGORY)
        adapter= ProductAdapter(this, DataService.getProducts(categoryType!!))

        var spanCount=2
        val screenSize= resources.configuration.screenWidthDp
        if (screenSize>720){
            spanCount=3
        }

        val layoutManager = GridLayoutManager(this, 2)
        binding?.productListView?.adapter=adapter
        binding?.productListView?.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)


    }
}