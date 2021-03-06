package com.gordon.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gordon.coderswag.Model.Category
import com.gordon.coderswag.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.category_list_item, parent, false);

        return Holder(view);
    }

    override fun getItemCount(): Int {
        return categories.count();
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], context);
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.imageView);
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName);

        fun bindCategory(category: Category, context: Context){
            val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName);
            categoryImage?.setImageResource(resourceID);
            categoryName?.text = category.title;
        }
    }
}