package ru.example.brainbox.uikit.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.example.brainbox.uikit.ui.theme.PrimaryButton
import ru.example.brainbox.uikit.ui.theme.TextLinkSign

@Composable
fun BrainBoxTextButton(text: String, onClick: () -> Unit){
        Text(
            text = text,
            modifier = Modifier.clickable(onClick = onClick),
            style = TextLinkSign,
            color = PrimaryButton
        )
}