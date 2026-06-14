package com.example.bloodpressure.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bloodpressure.BPItem
import com.example.bloodpressure.BPStatus
import com.example.bloodpressure.ui.BPIcons
import com.example.bloodpressure.ui.BPScreen
import com.example.bloodpressure.ui.BPStatusItemBig
import com.example.bloodpressure.ui.WhiteCard
import com.example.bloodpressure.ui.icons.Calendar
import com.example.bloodpressure.ui.icons.Heart
import com.example.bloodpressure.ui.icons.Watch
import com.example.bloodpressure.ui.theme.BPTheme

@Preview
@Composable
fun HomeScreen() {
    BPScreen(
        modifier = Modifier,
        content = {
            val item = BPItem()

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 24.dp)
            ) {
                TopBar()
                Spacer(Modifier.height(32.dp))
                LastMeasureCard(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    bpItem = item
                )
            }
        }
    )
}

@Composable
private fun TopBar(

) {
    Text(
        modifier = Modifier.padding(horizontal = 24.dp),
        text = "Hello, David",
        color = BPTheme.colors.textNavy162456,
        style = BPTheme.typography.extraBold30
    )
    Spacer(Modifier.height(8.dp))
    Text(
        modifier = Modifier.padding(horizontal = 24.dp),
        text = "Here is your latest health update.",
        color = BPTheme.colors.textDarkGreen007A55,
        style = BPTheme.typography.regular18
    )
}

@Composable
private fun LastMeasureCard(
    modifier: Modifier = Modifier,
    bpItem: BPItem
) {
    WhiteCard(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Row {
                Row(
                    modifier = Modifier
                ) {
                    Image(
                        imageVector = BPIcons.Heart,
                        contentDescription = null,
//                    colorFilter = ColorFilter.tint()
                    )
                    Spacer(Modifier.width(8.dp))

                    Text(
                        "Latest measure",
                    )


                }
                Spacer(Modifier.width(24.dp))
                Column(
                    modifier = Modifier
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            imageVector = BPIcons.Calendar,
                            contentDescription = null,
//                    colorFilter = ColorFilter.tint()
                        )
                        Spacer(Modifier.width(4.dp))
                        Text("Jun 1, 2026")
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            imageVector = BPIcons.Watch,
                            contentDescription = null,
//                    colorFilter = ColorFilter.tint()
                        )
                        Spacer(Modifier.width(4.dp))
                        Text("9:45 PM")
                    }
                }
            }
            Spacer(Modifier.height(24.dp))
            BPStatusItemBig(
                modifier = Modifier.fillMaxWidth(),
                bpStatus = BPStatus.HYPERTENSION_1
            )
            Spacer(Modifier.height(24.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                ,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                SquareCard(
                    icon = BPIcons.Heart,
                    iconColor = Color.Red,
                    value = bpItem.pulse.toString(),
                    description = "Pulse (BPM)".uppercase(),
                    descriptionColor = BPTheme.colors.textDarkGreen007A55,
                    bgColor = BPTheme.colors.strokeCard
                )
                SquareCard(
                    icon = BPIcons.Heart,
                    iconColor = Color.Red,
                    value = bpItem.pulse.toString(),
                    description = "Atm (mmHg)".uppercase(),
                    descriptionColor = BPTheme.colors.textDarkGreen007A55,
                    bgColor = BPTheme.colors.strokeCard
                )
            }
        }
    }
}

@Composable
private fun SquareCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    iconColor: Color,
    value: String,
    description: String,
    descriptionColor: Color,
    bgColor: Color
) {
    WhiteCard(
        modifier = modifier,
        strokeColor = null,
        elevation = 0.dp,
        color = bgColor,
        cornerRadius = 16.dp
    ) {
        Column(
            modifier = Modifier
                .padding(
                    vertical = 16.dp,
                    horizontal = 24.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                imageVector = icon,
                contentDescription = null,
                colorFilter = ColorFilter.tint(iconColor)
            )
            Spacer(Modifier.width(10.dp))
            Text(
                text = value,
                style = BPTheme.typography.bold30,
                color = Color.Black,
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = description,
                color = descriptionColor,
                style = BPTheme.typography.medium14,
            )
        }
    }
}
