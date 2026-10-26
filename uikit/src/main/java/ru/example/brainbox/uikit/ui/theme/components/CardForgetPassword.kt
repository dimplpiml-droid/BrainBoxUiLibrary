package ru.example.brainbox.uikit.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uikit.R
import ru.example.brainbox.uikit.ui.theme.MutedText
import ru.example.brainbox.uikit.ui.theme.PoppinsFontFamily
import ru.example.brainbox.uikit.ui.theme.PrimaryText

@Composable
fun CardForgetPassword(
    image: Painter,
    mainText: String,
    secondaryText: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        shape = RoundedCornerShape(10.dp),

    ) {
        Row(modifier = Modifier.fillMaxWidth()
            .padding(top = 15.dp,
            bottom = 15.dp,
            start = 17.dp,
            end = 74.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier.size(50.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF3636361A)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = image,
                    contentDescription = "Black Email",
                )
            }
            Column(modifier = Modifier.padding(start = 19.dp)){
                Text(text = mainText,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = PoppinsFontFamily,
                    fontSize = 18.sp,
                    color = PrimaryText
                )
                Text(text = secondaryText,
                    fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    color = MutedText
                    )
            }


        }
    }
}

@Composable
@Preview(showBackground = true)
fun CardForgetPasswordPreview() {
    CardForgetPassword(image = painterResource(R.drawable.ic_black_email),
        mainText = "Email",
        secondaryText = "Code Send to your email")
}