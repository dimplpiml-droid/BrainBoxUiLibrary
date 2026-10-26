package ru.example.brainbox.uikit.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uikit.R
import ru.example.brainbox.uikit.ui.theme.NavigatorCard
import ru.example.brainbox.uikit.ui.theme.NestButton
import ru.example.brainbox.uikit.ui.theme.PrevButton
import ru.example.brainbox.uikit.ui.theme.VerticalStick

@Composable
fun BrainBoxNavigaorCard(
    onPrevClick: () -> Unit,
    onNextclick: () -> Unit,
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 30.dp
        ),
        colors = CardDefaults.cardColors(NavigatorCard),
        modifier = Modifier
            .width(154.dp)
            .height(64.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize().padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = onPrevClick) {
                Icon(
                    painter = painterResource(R.drawable.ic_left_line),
                    contentDescription = "Previous",
                    tint = PrevButton
                )
            }
            Icon(
                painter = painterResource(R.drawable.ic_vertical_stick),
                contentDescription = "vertical stick",
                tint = VerticalStick
            )
            IconButton(onClick = onNextclick) {
                Icon(
                    painter = painterResource(R.drawable.ic_right_line),
                    contentDescription = "Next",
                    tint = NestButton
                )
            }
        }
    }
}
