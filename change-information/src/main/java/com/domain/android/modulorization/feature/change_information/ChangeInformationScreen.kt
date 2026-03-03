package com.domain.android.modulorization.feature.change_information

import android.app.Activity
import android.content.Intent
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
import androidx.lifecycle.ViewModelProvider

class ChangeInformationScreen : ComponentActivity() {

    companion object {
        fun newInstance(activity: Activity) = Intent(activity, ChangeInformationScreen::class.java)
    }

    private lateinit var viewmodel: ChangeInformationScreenModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewmodel = ViewModelProvider(owner = this)[ChangeInformationScreenModel::class.java]

        enableEdgeToEdge()
        setContent { ScreenBody() }
    }

    @Composable
    private fun ScreenBody() {
        Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(
                    text = "Change Info Screen!",
                    modifier = Modifier
                        .clickable {
                            this@ChangeInformationScreen.finish()
                        }
                        .padding(paddingValues = padding)

                )
            }
        }
    }
}