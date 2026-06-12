package com.example.bloodpressure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bloodpressure.ui.BPIcons
import com.example.bloodpressure.ui.BPScreen
import com.example.bloodpressure.ui.BPStatusItemBig
import com.example.bloodpressure.ui.icons.Calendar
import com.example.bloodpressure.ui.icons.Heart
import com.example.bloodpressure.ui.icons.Watch
import com.example.bloodpressure.ui.theme.BloodPressureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BPScreen
            ) {

            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    LastMeasure(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize(),
        bpItem = TODO()
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BloodPressureTheme {
        Greeting("Android")
    }
}

@Composable
fun LastMeasure(
    modifier: Modifier = Modifier,
    bpItem: BPItem
    ) {
    Card(
        modifier = modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFF0FDF4),
                        Color(0xFFD0FAE5)
                    )
                )
            ),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
//        colors = CardDefaults.cardColors(
//            containerColor = MaterialTheme.colorScheme.surfaceContainer
//        )
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

            ) {
                SquareCard(
                    icon = BPIcons.Heart,
                    iconColor = Color.Red,
                    value = bpItem.pulse.toString(),
                    description = bpItem.note,
                    descriptionColor = Color.Green,
                    bgColor = Color.Black,
                )
            }

        }
    }
}

@Composable
fun SquareCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    iconColor: Color,
    value: String,
    description: String,
    descriptionColor: Color,
    bgColor: Color
) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(16.dp))
            .background(bgColor)
            .padding(16.dp)
        ,
        contentAlignment = Alignment.Center
    ) {
        Column(

        ) {
            Image(
                imageVector = icon,
                contentDescription = null,
                colorFilter = ColorFilter.tint(iconColor)
            )
            Text(
                text = value,
                color = Color.Black,
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = description,
                color = descriptionColor,
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}