package com.example.ahwazfriut.ViewModelLiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ahwazfriut.Models.ModelProductMain

class ViewModelPassItem:ViewModel() {



    val pass = MutableLiveData<ArrayList<ModelProductMain>>()



   fun passdata (model : ArrayList<ModelProductMain>) {

       pass.postValue(model)


   }
}