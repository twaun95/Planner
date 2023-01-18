package com.twaun95.presentation.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel : ViewModel() {

    protected val _loading = MutableStateFlow(false)
    val loading: StateFlow<Boolean>
        get() = _loading


    protected fun startLoading() { _loading.value = true }
    protected fun stopLoading() { _loading.value = false }
    protected fun setLoading(isLoading: Boolean) {
        _loading.value = isLoading
    }
}