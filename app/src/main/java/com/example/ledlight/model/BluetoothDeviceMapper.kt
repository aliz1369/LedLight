package com.example.ledlight.model

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.example.ledlight.model.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}