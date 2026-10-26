package com.example.brainboxuilibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ru.example.brainbox.uikit.ui.theme.BrainBoxTheme
import ru.example.brainbox.uikit.ui.theme.SecondaryButtonText
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxBackButton
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxButton
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxNavigaorCard
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxOutlineTextField
import ru.example.brainbox.uikit.ui.theme.components.ButtonKind
import ru.example.brainbox.uikit.ui.theme.components.ButtonShape
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxSocialButton
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxTextLink
import ru.example.brainbox.uikit.ui.theme.components.BrainBoxTextSkip
import ru.example.brainbox.uikit.ui.theme.components.SocialMedia

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BrainBoxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier
                        .padding(innerPadding)
                        .padding(horizontal = 35.dp)) {
                        Spacer(modifier = Modifier.padding(10.dp))
                        BrainBoxBackButton(onClick = {}, )
                        Spacer(modifier = Modifier.padding(10.dp))

                        BrainBoxButton(
                            onClick = {},
                            text = " Log in",
                            shape = ButtonShape.Pill,
                            modifier = Modifier,
                            kind = ButtonKind.Secondary,
                            color = SecondaryButtonText
                        )
                        Spacer(modifier = Modifier.padding(10.dp))
                        BrainBoxButton(
                            onClick = {},
                            text = "Log in",
                            kind = ButtonKind.Primary,
                            shape = ButtonShape.Standard,
                            modifier = Modifier
                        )
                        Spacer(modifier = Modifier.padding(10.dp))

                        var textState by remember { mutableStateOf("") }
                        var passState by remember { mutableStateOf("") }
                        BrainBoxOutlineTextField(
                            value = textState,
                            onValueChange = { textState = it },
                            placeholder = "Email",
                            leadingIcon = { tintColor ->
                                Icon(
                                    painter = painterResource(id = com.example.uikit.R.drawable.ic_email),
                                    contentDescription = "Email Icon",
                                    tint = tintColor
                                )
                            },
                        )

                        Spacer(modifier = Modifier.padding(10.dp))

                        BrainBoxOutlineTextField(
                            value = passState,
                            onValueChange = { passState = it },
                            placeholder = "Password",
                            isPassword = true,
                            trailingIcon = {
                                Icon(
                                    painter = painterResource(id = com.example.uikit.R.drawable.ic_eye_off),
                                    contentDescription = "Password Icon",
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    painter = painterResource(id = com.example.uikit.R.drawable.ic_lock),
                                    contentDescription = "Password Icon",
                                    tint = it
                                )
                            }
                        )

                        Spacer(modifier = Modifier.padding(10.dp))

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(14.dp)
                        ) {

                            BrainBoxSocialButton(
                                text = "GOOGLE",
                                onClick = { },
                                modifier = Modifier.weight(1f),
                                socialMedia = SocialMedia.Google
                            )


                            BrainBoxSocialButton(
                                text = "FACEBOOK",
                                onClick = { },
                                modifier = Modifier.weight(1f),
                                socialMedia = SocialMedia.Facebook
                            )
                        }

                        Spacer(modifier = Modifier.padding(10.dp))

                        BrainBoxTextLink(onClick = {}, text = "Sign up")

                        Spacer(modifier = Modifier.padding(10.dp))
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = androidx.compose.ui.Alignment.Center
                        ) {
                            BrainBoxNavigaorCard(onPrevClick = {}, onNextclick = {})
                        }
                        Spacer(modifier = Modifier.padding(10.dp))
                        BrainBoxTextSkip(onClick = {})
                    }
                }
            }
        }
    }
}

