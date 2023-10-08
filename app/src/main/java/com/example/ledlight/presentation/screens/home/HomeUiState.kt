package com.example.ledlight.presentation.screens.home

import com.example.ledlight.model.BluetoothDevice

data class HomeUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)
