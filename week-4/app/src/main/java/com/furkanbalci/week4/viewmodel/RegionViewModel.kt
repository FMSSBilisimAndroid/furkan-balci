package com.furkanbalci.week4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.furkanbalci.week4.data.RegionModel
import com.furkanbalci.week4.repository.RegionRepository
import kotlinx.coroutines.launch

/**
 * Region view model
 */
class RegionViewModel : ViewModel() {

    private val _regionList = MutableLiveData<List<RegionModel>>()
    val regionList: LiveData<List<RegionModel>>
        get() = _regionList

    init {
        getRegionList()
    }

    private fun getRegionList() {
        viewModelScope.launch {
            _regionList.value = RegionRepository().getRegions()
        }
    }

}