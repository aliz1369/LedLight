package com.example.ledlight.presentation.screens.home


import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.ledlight.presentation.components.DeviceScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(
    viewModel: HomeViewModel,
    state: HomeUiState
) {
    Scaffold()
    {
        DeviceScreen(
            state = state,
            onStartScan = viewModel::startScan,
            onStopScan = viewModel::stopScan
        )
    }
}