package com.gordon.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gordon.coderswag.Adapters.CategoryAdapter
import com.gordon.coderswag.Adapters.CategoryRecycleAdapter
import com.gordon.coderswag.Model.Category
import com.gordon.coderswag.R
import com.gordon.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories);
        catergoryListView.adapter = adapter;

        val layoutManager = LinearLayoutManager(this);
        catergoryListView.layoutManager = layoutManager;
        catergoryListView.setHasFixedSize(true);
    }
}