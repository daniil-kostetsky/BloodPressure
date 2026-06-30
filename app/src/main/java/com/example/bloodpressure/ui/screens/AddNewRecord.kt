package com.example.bloodpressure.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bloodpressure.BPItem
import com.example.bloodpressure.ui.BPScreen
import com.example.bloodpressure.ui.WhiteCard
import com.example.bloodpressure.ui.theme.BPTheme
import kotlinx.coroutines.flow.filter
import kotlin.math.abs

@Composable
fun AddNewRecord(

) {
    BPScreen(
        modifier = Modifier,
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        vertical = 24.dp,
                        horizontal = 16.dp
                    )
            ) {
                WhiteCard(
                    modifier = Modifier
                        .fillMaxWidth(),
                    color = BPTheme.colors.bgSecondary,
                    strokeColor = BPTheme.colors.strokeGrey,
                    content = {

                        Row(
                            horizontalArrangement = Arrangement.SpaceAround,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(374.dp)
                                .padding(16.dp)
                            ,
                        ) {
//
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "SYS",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    color = BPTheme.colors.textPrimary,
                                    style = BPTheme.typography.bold24
                                )
                                Text(
                                    text = "mmHg",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    color = BPTheme.colors.textPrimaryLight,
                                    style = BPTheme.typography.medium18
                                )

                                Spacer(Modifier.height(16.dp))

                                WheelPicker(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                    ,
                                    values = 70..220,
                                    selectedValue = 120,
                                    onValueSelected = {
//                                    systolic = it
                                    },
                                    divider = false

                                )
                            }


                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "DIA",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    color = BPTheme.colors.textPrimary,
                                    style = BPTheme.typography.bold24
                                )
                                Text(
                                    text = "mmHg",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    color = BPTheme.colors.textPrimaryLight,
                                    style = BPTheme.typography.medium18
                                )
                                Spacer(Modifier.height(16.dp))
                                WheelPicker(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxWidth()
                                    ,
                                    values = 30..130,
                                    selectedValue = 80,
                                    onValueSelected = {
//                                    diastolic = it
                                    },
                                    divider = true
                                )
                            }

                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "PUL",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    color = BPTheme.colors.textPrimary,
                                    style = BPTheme.typography.bold24
                                )
                                Text(
                                    text = "BPM",
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center,
                                    color = BPTheme.colors.textPrimaryLight,
                                    style = BPTheme.typography.medium18
                                )
                                Spacer(Modifier.height(16.dp))
                                WheelPicker(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxWidth()
                                    ,
                                    values = 30..220,
                                    selectedValue = 60,
                                    onValueSelected = {
//                                    pulse = it
                                    },
                                    divider = true
                                )
                            }
                        }
                    }
                )
            }
        }
    )
}

@Composable
fun WheelPicker(
    values: IntRange,
    selectedValue: Int,
    onValueSelected: (Int) -> Unit,
    modifier: Modifier = Modifier,
    divider: Boolean
) {
    val itemHeight = 56.dp
    val visibleItemsCount = 5
    val centerIndex = visibleItemsCount / 2

    val listState = rememberLazyListState(
        initialFirstVisibleItemIndex =
            (selectedValue - values.first - centerIndex).coerceAtLeast(0)
    )


    val flingBehavior = rememberSnapFlingBehavior(listState)

    LaunchedEffect(listState) {
        snapshotFlow { listState.isScrollInProgress }
            .filter { !it }
            .collect {
                val layoutInfo = listState.layoutInfo

                val center =
                    (layoutInfo.viewportStartOffset +
                            layoutInfo.viewportEndOffset) / 2

                val closestItem =
                    layoutInfo.visibleItemsInfo.minByOrNull {
                        abs((it.offset + it.size / 2) - center)
                    }

                closestItem?.let {
                    onValueSelected(values.first + it.index)
                }
            }
    }

    Box(
        modifier = modifier.height(itemHeight * visibleItemsCount)
    ) {
        // Выделенная область выбора
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
                .height(56.dp)
                .background(
                    Color.LightGray.copy(alpha = 0.2f)
                )
        )

        LazyColumn(
            state = listState,
            flingBehavior = flingBehavior,
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(
                vertical = itemHeight * centerIndex
            ),
//            modifier = Modifier.fillMaxSize()
        ) {
            items(values.count()) { index ->

                val itemInfo =
                    listState.layoutInfo.visibleItemsInfo.firstOrNull {
                        it.index == index
                    }

                val scale = remember(itemInfo) {
                    derivedStateOf {
                        if (itemInfo == null) return@derivedStateOf 0.8f

                        val viewportCenter =
                            (listState.layoutInfo.viewportStartOffset +
                                    listState.layoutInfo.viewportEndOffset) / 2f

                        val itemCenter =
                            itemInfo.offset + itemInfo.size / 2f

                        val distance =
                            abs(viewportCenter - itemCenter)

                        val normalized =
                            (distance / itemInfo.size)
                                .coerceIn(0f, 2f)

                        lerp(
                            start = 1f,
                            stop = 0.75f,
                            fraction = normalized / 2f
                        )
                    }
                }

                val alpha = remember(itemInfo) {
                    derivedStateOf {
                        if (itemInfo == null) return@derivedStateOf 0.3f

                        val viewportCenter =
                            (listState.layoutInfo.viewportStartOffset +
                                    listState.layoutInfo.viewportEndOffset) / 2f

                        val itemCenter =
                            itemInfo.offset + itemInfo.size / 2f

                        val distance =
                            abs(viewportCenter - itemCenter)

                        val normalized =
                            (distance / itemInfo.size)
                                .coerceIn(0f, 2f)

                        lerp(
                            start = 1f,
                            stop = 0.25f,
                            fraction = normalized / 2f
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .height(itemHeight)
                        .fillMaxWidth()
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "${values.first + index}",
                        modifier = Modifier
                            .fillMaxWidth()
                            .graphicsLayer {
                            scaleX = scale.value
                            scaleY = scale.value
                            rotationX = (1f - scale.value) * 70f

                            this.alpha = alpha.value
                        },
                        textAlign = TextAlign.Center,
                        fontSize = 40.sp
                    )
                }
            }
        }
    }
    if (divider) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
                .background(Color.Gray.copy(alpha = 0.2f))
        )
    }
}

private fun lerp(
    start: Float,
    stop: Float,
    fraction: Float
): Float {
    return start + (stop - start) * fraction
}



//private fun