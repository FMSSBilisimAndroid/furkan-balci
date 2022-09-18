package com.furkanbalci.week4.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.furkanbalci.week4.viewmodel.RegionViewModel
import com.furkanbalci.week4.adapter.RegionItemAdapter
import com.furkanbalci.week4.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var viewModel: RegionViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[RegionViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.layoutManager = GridLayoutManager(this.requireContext(), 2)

        viewModel.regionList.observe(viewLifecycleOwner) {
            binding.recyclerView.adapter = RegionItemAdapter(it)
        }
    }
}