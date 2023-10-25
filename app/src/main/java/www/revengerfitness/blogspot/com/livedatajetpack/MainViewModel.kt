package www.revengerfitness.blogspot.com.livedatajetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){

   private val factsLiveDataObject=MutableLiveData<String>("prashant chauhan") // we can change this data.
    val factsLiveData:LiveData<String>
        get() = factsLiveDataObject

    fun updateLiveData(){
        factsLiveDataObject.value="Maulik chauhan"
    }
}