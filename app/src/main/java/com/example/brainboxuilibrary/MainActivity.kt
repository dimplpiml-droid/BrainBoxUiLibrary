package com.example.brainboxuilibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.example.brainbox.uikit.ui.theme.BrainBoxTheme
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxButton
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxOutlineTextField
import ru.example.brainbox.uikit.ui.theme.components.ButtonShape

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BrainBoxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        BrainBoxButton(onClick = {}, text = " Log in", shape = ButtonShape.Standard, modifier = Modifier)
                        Spacer(modifier = Modifier.padding(10.dp))

                        var textState by remember { mutableStateOf("") }
var passState by remember {mutableStateOf("") }
                        BrainBoxOutlineTextField(value = textState, onValueChange = { textState = it }, placeholder = "Email")
                        Spacer(modifier = Modifier.padding(10.dp))
                        BrainBoxOutlineTextField(value = passState, onValueChange = { passState = it }, placeholder = "Password", isPassword = true)

                    }
                }
            }
        }
    }
}

