package com.moonturns.marketlist.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moonturns.marketlist.R
import com.moonturns.marketlist.model.MarketList
import kotlinx.android.synthetic.main.rv_item.view.*

class MarketListRecyclerviewAdapter(var list: ArrayList<MarketList>) :
    RecyclerView.Adapter<MarketListRecyclerviewAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.itemView.txtId.text = "" + list[position].listId
        holder.itemView.txtProductName.text = list[position].name
        holder.itemView.txtCount.text = list[position].count
        holder.itemView.cbDone.text = list[position].name
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    fun update(newList: List<MarketList>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}