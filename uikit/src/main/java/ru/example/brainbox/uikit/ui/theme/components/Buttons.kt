package ru.example.brainbox.uikit.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import ru.example.brainbox.uikit.ui.theme.BrainBoxTypography
import ru.example.brainbox.uikit.ui.theme.ButtonText
import ru.example.brainbox.uikit.ui.theme.PrimaryButton
import ru.example.brainbox.uikit.ui.theme.SecondaryButton

enum class ButtonShape { Standard, Pill }
enum class ButtonKind { Primary, Secondary }

@Composable
fun BrainBoxButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier,
    kind: ButtonKind = ButtonKind.Primary,
    shape: ButtonShape = ButtonShape.Standard,
    isEnable: Boolean = true,
    style: TextStyle = BrainBoxTypography.bodyLarge,
    color: Color = ButtonText
) {
    val containerColor = when (kind) {
        ButtonKind.Primary -> PrimaryButton
        ButtonKind.Secondary -> SecondaryButton
    }
    val containerShape = when (shape) {
        ButtonShape.Standard -> RoundedCornerShape(14.dp)
        ButtonShape.Pill -> RoundedCornerShape(99.dp)
    }

    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 35.dp),
        enabled = isEnable,
        colors = ButtonDefaults.buttonColors(containerColor = containerColor),
        shape = containerShape
        ) {
        Text(text = text,
            style = style,
            color = color
        )
    }
}


