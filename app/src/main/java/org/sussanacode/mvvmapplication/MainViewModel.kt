package org.sussanacode.mvvmapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var str = "Main View Model"

    var livedataObserver: MutableLiveData<String> = MutableLiveData()
    var livedataObserver2: MutableLiveData<ViewPort> = MutableLiveData()



    fun emitValue1(){
        livedataObserver.value = "Main View Model Observer"
    }

    fun emitValue2(){
        livedataObserver.value = "Main View Model Observer 2"
    }

    fun emitValue3(){
        livedataObserver2.value = ViewPort(1, "Checking View!")
    }
}