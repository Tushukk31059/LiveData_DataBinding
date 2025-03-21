package com.example.livedata_databinding.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.livedata_databinding.domain.CustomDataClass

//
//class MainActViewModel(value: String): ViewModel() {
//    var liveData= MutableLiveData<String>(value)
//    val liveDataObj : LiveData<String>
////        get() = liveData
//    fun update(){
//        liveData.value="second"
//    }
//}
class MainActViewModel(value: CustomDataClass) : ViewModel() {
    var name = MutableLiveData(value.name)
    var rollNo=MutableLiveData(value.rollNo)

    fun update() {
//        liveData.value?.name="Rahul"
//        liveData.value?.rollNo="3"
        name.value = "Rahul"
        rollNo.value="3"
    }
}