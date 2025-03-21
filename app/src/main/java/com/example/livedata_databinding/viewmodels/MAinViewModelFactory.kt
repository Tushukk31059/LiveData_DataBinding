package com.example.livedata_databinding.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.livedata_databinding.domain.CustomDataClass

//
//class MAinViewModelFactory(var value: String): ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return MainActViewModel(value) as T
//    }
//}
class MAinViewModelFactory(var value: CustomDataClass): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainActViewModel(value) as T
    }
}