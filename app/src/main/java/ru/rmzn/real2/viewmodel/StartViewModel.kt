package ru.rmzn.real2.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class StartViewModel : ViewModel() {
    private val _phoneNumber = MutableStateFlow<String>("")
    private val _code = MutableStateFlow<String>("")
    private val _firstName = MutableStateFlow<String>("")
    private val _lastName = MutableStateFlow<String>("")

    val phoneNumber: StateFlow<String> get() = _phoneNumber
    val code: StateFlow<String> get() = _code
    val firstName: StateFlow<String> get() = _firstName
    val lastName: StateFlow<String> get() = _lastName

    fun setPhoneNumber(value: String) {
        _phoneNumber.value = value
    }

    fun setCode(value: String) {
        _code.value = value
    }

    fun setFirstName(value: String) {
        _firstName.value = value
    }

    fun setLastName(value: String) {
        _lastName.value = value
    }
}