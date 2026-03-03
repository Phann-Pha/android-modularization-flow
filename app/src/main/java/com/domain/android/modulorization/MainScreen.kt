package com.domain.android.modulorization

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.domain.android.modulorization.feature.change_information.ChangeInformationScreen

class MainScreen : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent { ScreenBody() }
    }

    @Composable
    private fun ScreenBody() {

        Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(
                    text = "Hello, world!",
                    modifier = Modifier
                        .clickable {
                            startActivity(ChangeInformationScreen.newInstance(activity = this@MainScreen))
                        }
                        .padding(paddingValues = padding)

                )
            }
        }
    }
}