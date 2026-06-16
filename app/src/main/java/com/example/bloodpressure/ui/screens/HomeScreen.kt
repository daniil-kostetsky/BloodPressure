package com.example.bloodpressure.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.bloodpressure.ui.icons.Chart
import com.example.bloodpressure.ui.icons.Heart
import com.example.bloodpressure.ui.icons.Monometer
import com.example.bloodpressure.ui.icons.Watch
import com.example.bloodpressure.ui.theme.BPColors.iconGreenBlue
import com.example.bloodpressure.ui.theme.BPColors.textNavy162456
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
            modifier = Modifier.padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = BPIcons.Chart,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(iconGreenBlue)
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        "Latest reading",
                        style = BPTheme.typography.bold20,
                        color = BPTheme.colors.textPrimary,
                    )
                }
                Spacer(Modifier.width(24.dp))
                //date time
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.End
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            imageVector = BPIcons.Calendar,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(BPTheme.colors.textGrey6A7282)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(
                            text = bpItem.date,
                            color = BPTheme.colors.textGrey6A7282,
                            style = BPTheme.typography.regular14
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            imageVector = BPIcons.Watch,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(BPTheme.colors.textGrey6A7282)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(
                            text = bpItem.time,
                            color = BPTheme.colors.textGrey6A7282,
                            style = BPTheme.typography.regular14
                        )
                    }
                }
            }
            Spacer(Modifier.height(24.dp))
            Row(
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = bpItem.sys.toString(),
                    color = BPTheme.colors.textPrimary,
                    style = BPTheme.typography.black60,
                )
                Spacer(Modifier.width(3.dp))
                Text(
                    modifier = Modifier.padding(bottom = 9.dp),
                    text = "/",
                    color = BPTheme.colors.textGrey6A7282,
                    style = BPTheme.typography.bold36,
                )
                Spacer(Modifier.width(3.dp))
                Text(
                    modifier = Modifier.padding(bottom = 2.dp),
                    text = bpItem.dia.toString(),
                    color = BPTheme.colors.textPrimaryLight,
                    style = BPTheme.typography.extraBold48,
                )
                Spacer(Modifier.width(12.dp))
                Text(
                    modifier = Modifier.padding(bottom = 10.dp),
                    text = "mmHg",
                    color = BPTheme.colors.textGrey6A7282,
                    style = BPTheme.typography.medium18,
                )
            }

            Spacer(Modifier.height(16.dp))
            BPStatusItemBig(
                modifier = Modifier.fillMaxWidth(),
                bpStatus = BPStatus.HYPERTENSION_1
            )
            Spacer(Modifier.height(24.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                SquareCard(
                    icon = BPIcons.Heart,
                    iconColor = BPTheme.colors.iconRedHeart,
                    value = bpItem.pulse.toString(),
                    description = "Pulse (BPM)".uppercase(),
                    descriptionColor = BPTheme.colors.textDarkGreen007A55,
                    bgColor = BPTheme.colors.strokeCard
                )
                SquareCard(
                    icon = BPIcons.Monometer,
                    iconColor = BPTheme.colors.lightBlue51A2FF,
                    value = bpItem.atmPressure.toString(),
                    description = "Atm (mmHg)".uppercase(),
                    descriptionColor = BPTheme.colors.blue1447E6,
                    bgColor = BPTheme.colors.bgBlue
                )
            }
            if (bpItem.note.isNotBlank()) {
                Spacer(Modifier.height(16.dp))
                WhiteCard(
                    modifier = Modifier
                        .fillMaxWidth()
                    ,
                    color = BPTheme.colors.bgSecondary,
                    strokeColor = BPTheme.colors.strokeGrey,
                    elevation = 0.dp,
                    cornerRadius = 14.dp,
                    content = {
                        Text(
                            modifier = Modifier.padding(16.dp),
                            text = "\"${bpItem.note}\"",
                            color = BPTheme.colors.textPrimaryLight,
                            style = BPTheme.typography.regularItalic16,
                        )
                    }
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
                color = textNavy162456,
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
