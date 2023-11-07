package com.example.quot.ui.extfunctions

import androidx.lifecycle.MutableLiveData

fun <T> MutableLiveData<T>.update(transform: T.()-> T) {
    value = value!!.transform()
}

operator fun MutableLiveData<*>.invoke() = value!!