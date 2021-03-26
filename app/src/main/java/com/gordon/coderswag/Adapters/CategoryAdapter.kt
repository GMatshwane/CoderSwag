package com.gordon.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.gordon.coderswag.Model.Category
import com.gordon.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>): BaseAdapter() {

    val context = context;
    val categories = categories;

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View;
        val holder: ViewHolder;

        if(convertView == null) {

            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null);
            holder = ViewHolder();
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            holder.categoryImage = categoryView.findViewById(R.id.imageView);

            categoryView.tag = holder;

        }
        else{
            holder = convertView.tag as ViewHolder;
            categoryView = convertView;
        }

        val resourceId = context.resources.getIdentifier(categories[position].image,"drawable", context.packageName);
        holder.categoryImage?.setImageResource(resourceId);
        holder.categoryName?.text = categories[position].title;

        return categoryView;
    }

    override fun getItem(position: Int): Any {
        return categories[position];
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        return categories.count();
    }

    private class ViewHolder{
        var categoryImage: ImageView? = null;
        var categoryName: TextView? = null;
    }
}