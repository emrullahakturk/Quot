package com.example.quot.ui.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quot.ui.extfunctions.update

class QuoteViewModel : ViewModel(){

    val state = MutableLiveData(QuoteState())
    fun onIntentWithTextExtra(textExtra: String) {
            state.update {
                copy(quote= textExtra)
            }
    }
}