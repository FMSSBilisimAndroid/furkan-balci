package com.furkanbalci.week4.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.furkanbalci.week4.data.RegionModel
import com.furkanbalci.week4.databinding.FragmentDetailsBinding
import com.furkanbalci.week4.utils.NumberUtils


class DetailsFragment() : Fragment() {

    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val region: RegionModel = arguments?.get("regionModel") as RegionModel
        binding.apply {
            //Set imageView.
            Glide.with(view)
                .load(region.imageUrl)
                .placeholder(androidx.appcompat.R.color.abc_background_cache_hint_selector_material_dark)
                .into(detailsImage)

            detailsItemId.text = region.id.toString()
            detailsBackButton.setOnClickListener {
                view.findNavController().popBackStack()
            }

            if (region.type == "rent") {
                detailsItemPrice.text = NumberUtils.decompose(region.price) + "$/month"
                detailsButton.text = "Rent"
            } else {
                detailsItemPrice.text = NumberUtils.decompose(region.price) + "$"
                detailsButton.text = "Buy"
            }

            detailsFullscreenButton.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setDataAndType(region.imageUrl.replace("http", "https").toUri(), "image/*")
                startActivity(intent)
            }
        }

    }
}