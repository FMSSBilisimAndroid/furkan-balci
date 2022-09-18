package com.furkanbalci.week4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.furkanbalci.week4.R
import com.furkanbalci.week4.data.RegionModel

/**
 * Item adapter for the recycler view
 * @param list list of regions
 */
class RegionItemAdapter(private val list: List<RegionModel>) : RecyclerView.Adapter<RegionItemViewHolder>() {

    /**
     * Creates the view holder
     * @param parent parent view
     * @param viewType view type
     * @return view holder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegionItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return RegionItemViewHolder(view)
    }

    /**
     * Binds the view holder
     * @param holder view holder
     * @param position position
     * @return view holder
     */
    override fun onBindViewHolder(holder: RegionItemViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    /**
     * Returns the item count
     * @return item count
     */
    override fun getItemCount(): Int {
        return this.list.size
    }
}