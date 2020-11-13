package com.example.smokies.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil

import androidx.recyclerview.widget.RecyclerView
import com.example.smokies.R
import com.example.smokies.db.Profit

class ProfitAdapter: RecyclerView.Adapter<ProfitAdapter.ProfitViewHolder>() {
    inner class ProfitViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    val diffCallback = object :DiffUtil.ItemCallback<Profit>(){
        override fun areItemsTheSame(oldItem: Profit, newItem: Profit): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Profit, newItem: Profit): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }
    val differ = AsyncListDiffer(this,diffCallback)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfitViewHolder {
        return ProfitViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.item_profit,parent,false
                )
        )
    }



    override fun getItemCount(): Int {
        return differ.currentList.size
    }
    override fun onBindViewHolder(holder: ProfitViewHolder, position: Int) {
      val run = differ.currentList[position]
        holder.itemView.apply {

        }
    }
}