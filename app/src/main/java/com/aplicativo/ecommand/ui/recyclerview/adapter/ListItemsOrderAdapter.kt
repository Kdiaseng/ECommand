package com.aplicativo.ecommand.ui.recyclerview.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aplicativo.ecommand.R
import com.aplicativo.ecommand.model.Item
import kotlinx.android.synthetic.main.item_order.view.*

class ListItemsOrderAdapter(
    private val items: ArrayList<Item>
) : RecyclerView.Adapter<ListItemsOrderAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Item) {
            itemView.textView_description_item.text = item.description
            itemView.textView_value_item.text = item.value.toString()
            itemView.textView_quantity_item.text = item.quantity.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.item_order, parent, false)
        return ViewHolder(viewHolder)
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }


}