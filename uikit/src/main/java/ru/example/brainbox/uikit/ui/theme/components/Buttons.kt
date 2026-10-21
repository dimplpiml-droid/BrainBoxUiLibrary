package ru.example.brainbox.uikit.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.uikit.R
import ru.example.brainbox.uikit.ui.theme.BrainBoxTypography
import ru.example.brainbox.uikit.ui.theme.FacebookButton
import ru.example.brainbox.uikit.ui.theme.FacebookText
import ru.example.brainbox.uikit.ui.theme.FacebookTextStyle
import ru.example.brainbox.uikit.ui.theme.GoogleButton
import ru.example.brainbox.uikit.ui.theme.GoogleText
import ru.example.brainbox.uikit.ui.theme.GoogleTextStyle
import ru.example.brainbox.uikit.ui.theme.PrimaryButtonText
import ru.example.brainbox.uikit.ui.theme.PrimaryButton
import ru.example.brainbox.uikit.ui.theme.SecondaryButton
import ru.example.brainbox.uikit.ui.theme.Surface

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
    color: Color = PrimaryButtonText
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
            .height(60.dp),
        enabled = isEnable,
        colors = ButtonDefaults.buttonColors(containerColor = containerColor),
        shape = containerShape
    ) {
        Text(
            text = text,
            style = style,
            color = color
        )
    }
}

enum class SocialMedia { Google, Facebook }

@Composable
fun BrainBoxSocialButton(
    text: String,
    onClick: () -> Unit,
    socialMedia: SocialMedia,
    modifier: Modifier
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(10.dp),
        colors = when (socialMedia) {
            SocialMedia.Google -> ButtonDefaults.buttonColors(
                containerColor = GoogleButton.copy(alpha = 0.25f),
                contentColor = GoogleText
            )

            SocialMedia.Facebook -> ButtonDefaults.buttonColors(
                containerColor = FacebookButton.copy(alpha = 0.25f),
                contentColor = FacebookText
            )
        },
        modifier = modifier.height(57.dp),
    )
    {
        Text(
            text = text,
            style = when (socialMedia) {
                SocialMedia.Google -> GoogleTextStyle
                SocialMedia.Facebook -> FacebookTextStyle
            }
        )
    }
}

@Composable
fun BrainBoxBackButton(
    onClick: () -> Unit,

) {
    FilledIconButton(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        colors = IconButtonDefaults.filledIconButtonColors(
            containerColor = Surface,
            contentColor = Color(0xFF000000)
        ),
        modifier = Modifier.size(45.dp)
    ) {
        Icon(painter = painterResource(R.drawable.ic_return_path), contentDescription = "Back")
    }
}