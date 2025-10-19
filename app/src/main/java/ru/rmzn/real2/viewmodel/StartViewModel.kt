package ru.rmzn.real2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartViewModel : ViewModel() {
    private val _phoneNumber = MutableLiveData<String>()
    private val _code = MutableLiveData<String>()
    private val _firstName = MutableLiveData<String>()
    private val _lastName = MutableLiveData<String>()

    val phoneNumber: LiveData<String> get() = _phoneNumber
}