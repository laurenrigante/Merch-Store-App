package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder

        if (convertView==null){
            categoryView=LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder= ViewHolder()
            holder.categoryImage= categoryView.findViewById(R.id.categoryImg)
            holder.categoryName= categoryView.findViewById(R.id.categoryName)
            println("i exist for the first time")

            categoryView.tag=holder
        }else{
            holder=convertView.tag as ViewHolder
            categoryView=convertView
            println("go green, recycle")
        }


        val category= categories[position]
        val resourceId= context.resources.getIdentifier(category.image, "drawable",context.packageName )
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text= category.title

        return categoryView
    }

    private class ViewHolder{
        var categoryImage: ImageView?= null
        var categoryName: TextView?=null
    }

}