package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.CategoryRecycleAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilitites.EXTRA_CATEGORY
import com.example.coderswag.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        var binding: ActivityMainBinding?=null
        lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        //setting up the view binding
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        adapter= CategoryRecycleAdapter(this, DataService.categories){
            category ->
            println(category.title)
            val productIntent= Intent(this, ProductsActivity ::class.java)
            productIntent.putExtra( EXTRA_CATEGORY ,category.title)
            startActivity(productIntent)
        }

        binding?.categoryListView?.adapter=adapter
        binding?.categoryListView?.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        /*findViewById<ListView>(R.id.categoryListView).setOnItemClickListener { adapterView, view, position, id ->
            val category= DataService.categories[position]
            Toast.makeText(this, "you clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }*/


    }
}