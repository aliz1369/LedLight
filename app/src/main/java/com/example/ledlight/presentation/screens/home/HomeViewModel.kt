package com.example.ledlight.presentation.screens.home

import androidx.lifecycle.ViewModel
import com.example.ledlight.model.BluetoothController
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val bluetoothController: BluetoothController
):ViewModel() {


}