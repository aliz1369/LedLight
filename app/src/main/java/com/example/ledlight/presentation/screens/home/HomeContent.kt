package com.example.ledlight.presentation.screens.home


import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.ledlight.presentation.components.DeviceScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(
    viewModel: HomeViewModel, state: HomeUiState
) {
//    LaunchedEffect(key1 = state.errorMessage) {
//        state.errorMessage?.let { message ->
//            Toast.makeText(
//                applicationContext,
//                message,
//                Toast.LENGTH_LONG
//            ).show()
//        }
//    }
//    LaunchedEffect(key1 = state.isConnected) {
//        if (state.isConnected) {
//            Toast.makeText(
//                applicationContext,
//                "You're connected!",
//                Toast.LENGTH_LONG
//            ).show()
//        }
//    }
    Scaffold() {

        when {
            state.isConnecting -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    CircularProgressIndicator()
                    Text(text = "Connecting...")
                }
            }

            else -> {
                DeviceScreen(
                    state = state,
                    onStartScan = viewModel::startScan,
                    onStopScan = viewModel::stopScan,
                    onDeviceClick = viewModel::connectToDevice,
                    onStartServer = viewModel::waitForIncomingConnection
                )
            }
        }

    }
}