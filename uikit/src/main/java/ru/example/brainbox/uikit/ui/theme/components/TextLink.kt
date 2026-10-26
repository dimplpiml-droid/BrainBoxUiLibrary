package ru.example.brainbox.uikit.ui.theme.components

import android.R
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ru.example.brainbox.uikit.ui.theme.PrimaryButton
import ru.example.brainbox.uikit.ui.theme.SkipText
import ru.example.brainbox.uikit.ui.theme.TextLinkSign
import ru.example.brainbox.uikit.ui.theme.TextLinkSkip

@Composable
fun BrainBoxTextLink(text: String, onClick: () -> Unit){
        Text(
            text = text,
            modifier = Modifier.clickable(onClick = onClick),
            style = TextLinkSign,
            color = PrimaryButton
        )
}

@Composable
fun BrainBoxTextSkip(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Skip",
        modifier = modifier.clickable(onClick = onClick),
        style = TextLinkSkip,)
}
