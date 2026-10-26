package ru.example.brainbox.uikit.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import ru.example.brainbox.uikit.ui.theme.BrainBoxTypography
import ru.example.brainbox.uikit.ui.theme.MutedText
import ru.example.brainbox.uikit.ui.theme.PrimaryText
import ru.example.brainbox.uikit.ui.theme.Surface

@Composable
fun BrainBoxOutlineTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    leadingIcon: @Composable ((tint: Color) -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    placeholder: String,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {
    val isFilled = value.isNotEmpty()
    val iconColor = if (isFilled) PrimaryText else MutedText

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        modifier = modifier
            .fillMaxWidth(),
        leadingIcon = if (leadingIcon != null) {
            {
                leadingIcon(iconColor)
            }
        } else {
            null
        },
        trailingIcon = trailingIcon,
        visualTransformation = visualTransformation,
        placeholder = {
            Text(
                text = placeholder,
                style = BrainBoxTypography.bodyMedium,
                color = MutedText
            )
        },
        shape = RoundedCornerShape(13.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Surface,
            focusedBorderColor = PrimaryText,
            focusedTextColor = PrimaryText,
            unfocusedTextColor = MutedText,
            focusedContainerColor = Surface,
            unfocusedContainerColor = Surface,
            unfocusedTrailingIconColor = MutedText,
            focusedTrailingIconColor = MutedText
        ),
        textStyle = BrainBoxTypography.bodyMedium,
    )
}
