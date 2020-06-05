package com.aplicativo.ecommand.ui.recyclerview.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aplicativo.ecommand.R
import com.aplicativo.ecommand.model.Item
import kotlinx.android.synthetic.main.item_order.view.*
import com.aplicativo.ecommand.databinding.ItemOrderBinding


class ListItemsOrderAdapter(
    private val items: ArrayList<Item>
) : RecyclerView.Adapter<ListItemsOrderAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemOrderBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Item) {
           binding.item = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewDataBinding = ItemOrderBinding.inflate(inflater,parent, false)
        return ViewHolder(viewDataBinding)
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }


}