package com.hnf.retrofit.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hnf.retrofit.data.response.CustomerReviewsItem
import com.hnf.retrofit.data.response.Restaurant

class MainViewModel : ViewModel() {

    private val _restaurant = MutableLiveData<Restaurant> ()
    val restaurant: LiveData<Restaurant> = _restaurant

    private val _listReview = MutableLiveData<CustomerReviewsItem>()
    val listReview: MutableLiveData<CustomerReviewsItem> = _listReview

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    companion object {
        private const val TAG ="MainViewModel"
        private const val RESTAURANT_ID = "uewq1zg2zlskfw1e867"
    }
}