package com.furkanbalci.week4.adapter

import android.annotation.SuppressLint
import android.os.Build
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.toColorInt
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.furkanbalci.week4.MainActivity
import com.furkanbalci.week4.R
import com.furkanbalci.week4.data.RegionModel
import com.furkanbalci.week4.ui.DetailsFragment
import com.furkanbalci.week4.utils.NumberUtils
import java.util.function.Consumer

/**
 * Region item view holder
 * @param view view
 */
class RegionItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private lateinit var imageView: ImageView
    private lateinit var priceTextView: TextView
    private lateinit var locationTextView: TextView
    private lateinit var typeTextView: TextView

    /**
     * Bind region item
     * @param regionModel region model
     */
    @SuppressLint("SetTextI18n")
    fun bindItem(regionModel: RegionModel) {

        //Set views
        this.imageView = view.findViewById(R.id.item_image)
        this.priceTextView = view.findViewById(R.id.item_price_text)
        this.locationTextView = view.findViewById(R.id.item_location_text)
        this.typeTextView = view.findViewById(R.id.type_text)

        //Set image
        Glide.with(view)
            .load(regionModel.imageUrl)
            .placeholder(androidx.appcompat.R.color.abc_background_cache_hint_selector_material_dark)
            .into(this.imageView)

        //Set price text
        this.priceTextView.text = NumberUtils.decompose(regionModel.price) + "$"

        //Set location text
        this.locationTextView.text = regionModel.id.toString()

        //If region type is "buy" set color to green, else set color to red
        if (regionModel.type == "buy") {
            this.typeTextView.text = "For Sale"
            this.typeTextView.setTextColor("#CC3636".toColorInt())
        } else {
            this.typeTextView.text = "For Rent"
            this.typeTextView.setTextColor("#367E18".toColorInt())
        }

        //Set on click listener
        view.setOnClickListener {
            view.findNavController().navigate(R.id.action_listFragment_to_detailsFragment, bundleOf("regionModel" to regionModel))
        }
    }

}