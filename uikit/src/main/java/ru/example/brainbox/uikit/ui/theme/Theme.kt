package ru.example.brainbox.uikit.ui.theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.uikit.R

val PoppinsFontFamily = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_semibold, FontWeight.SemiBold)
)
val UrbanistFontFamily = FontFamily(
    Font(R.font.urbanist_bold , FontWeight.Bold)
)

private val LIghtColorSheme = lightColorScheme(
    background = Background,
    surface = Surface,
    onBackground = PrimaryText,
    onSurface = PrimaryText,
    primary = PrimaryButton
)

@Composable
fun BrainBoxTheme(content: @Composable () -> Unit){
    MaterialTheme(
        colorScheme = LIghtColorSheme,
        typography = BrainBoxTypography,
        content = content
    )
}