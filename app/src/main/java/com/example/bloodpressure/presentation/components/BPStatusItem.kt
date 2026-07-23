package com.example.bloodpressure.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bloodpressure.domain.entity.BPStatus
import com.example.bloodpressure.presentation.ui.theme.BPTheme

@Composable
fun BPStatusItemBig(
    modifier: Modifier = Modifier,
    bpStatus: BPStatus = BPStatus.NORMAL
) {
    Card(
        modifier = modifier
            .clip(RoundedCornerShape(14.dp))
        ,
        shape = RoundedCornerShape(14.dp),
        border = BorderStroke(
            width = 1.dp,
            color = bpStatus.borderColor
        ),
        colors = CardDefaults.cardColors(
            containerColor = bpStatus.backgroundColor
        )
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 12.dp)
            ,
            text = bpStatus.text,
            color = bpStatus.textColor,
            style = BPTheme.typography.bold24
        )
    }
}

@Composable
fun BPStatusItemSmall(
    modifier: Modifier = Modifier,
    bpStatus: BPStatus = BPStatus.NORMAL
) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(bpStatus.backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 4.dp
                )
            ,
            text = bpStatus.text.uppercase(),
            color = bpStatus.textColor,
            style = BPTheme.typography.bold12
        )
    }
}

@Preview
@Composable
private fun BPStatusItemBigAll() {
    Column(
        modifier =  Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(24.dp)
        ,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        BPStatus.entries.forEach {
            BPStatusItemBig(
                modifier = Modifier.fillMaxWidth(),
                bpStatus = it
            )
            BPStatusItemSmall(
                bpStatus = it
            )
        }
    }
}