package com.example.adriandice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.example.SimonDicePCClase.modelview.MyViewModel
import com.example.SimonDicePCClase.view.myApp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            val context = LocalContext.current


            val viewModel = remember { MyViewModel(context) }


            myApp(viewModel)
        }
    }
}