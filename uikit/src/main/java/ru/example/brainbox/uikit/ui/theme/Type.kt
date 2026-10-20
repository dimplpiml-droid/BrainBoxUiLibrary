package ru.example.brainbox.uikit.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val BrainBoxTypography = Typography(
    headlineLarge = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 38.sp,
        color = PrimaryText
    ),
    headlineMedium = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp,
        color = PrimaryText
    ),
    bodyLarge = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = MutedText
    ),
    bodyMedium = TextStyle(
        fontFamily = PoppinsFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    ),
)

val WelcomeTitleStyle = TextStyle(
    fontFamily = UrbanistFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 40.sp,
    color = PrimaryText
    )
val UrbanistButtonTextStyle = TextStyle(
    fontFamily = UrbanistFontFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 18.sp,
    color = Surface
)

