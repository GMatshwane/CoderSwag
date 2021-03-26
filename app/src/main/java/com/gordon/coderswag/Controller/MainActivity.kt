package com.gordon.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.gordon.coderswag.Adapters.CategoryAdapter
import com.gordon.coderswag.Model.Category
import com.gordon.coderswag.R
import com.gordon.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories);
        catergoryListView.adapter = adapter;

        catergoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val caterory = DataService.categories[i];
            Toast.makeText(this, "You clicked on ${caterory} cell.", Toast.LENGTH_SHORT).show();
        }

    }
}