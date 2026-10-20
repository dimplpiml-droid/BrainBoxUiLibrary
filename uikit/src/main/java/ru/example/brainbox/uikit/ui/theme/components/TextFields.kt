package ru.example.brainbox.uikit.ui.theme.components

import android.R
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    placeholder: String,
    isPassword: Boolean = false
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 35.dp),
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        visualTransformation = if (isPassword) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
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
    ),
    textStyle = BrainBoxTypography.bodyMedium,
    )
}
