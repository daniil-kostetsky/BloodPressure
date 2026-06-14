package com.example.bloodpressure.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bloodpressure.BPItem
import com.example.bloodpressure.ui.icons.Heart
import com.example.bloodpressure.ui.theme.BPTheme

@Composable
fun HistoryItem(
    modifier: Modifier = Modifier,
    bpItem: BPItem
) {
    WhiteCard(
        modifier = modifier,
        strokeColor = null,
        cornerRadius = 16.dp
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = bpItem.date,
                    color = BPTheme.colors.textGrey6A7282,
                    style = BPTheme.typography.medium14,
                )
                Text(
                    text = bpItem.time,
                    color = BPTheme.colors.textGrey6A7282,
                    style = BPTheme.typography.medium14,
                )
            }
            Spacer(Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = bpItem.sys.toString(),
                    color = BPTheme.colors.textPrimary,
                    style = BPTheme.typography.black30,
                )
                Spacer(Modifier.width(3.dp))
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = "/",
                    color = BPTheme.colors.textGrey6A7282,
                    style = BPTheme.typography.bold20,
                )
                Spacer(Modifier.width(3.dp))
                Text(
                    modifier = Modifier.padding(bottom = 1.dp),
                    text = bpItem.dia.toString(),
                    color = BPTheme.colors.textPrimaryLight,
                    style = BPTheme.typography.bold24,
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = "mmHg",
                    color = BPTheme.colors.textGrey6A7282,
                    style = BPTheme.typography.medium14,
                )
            }
            Spacer(Modifier.height(8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                BPStatusItemSmall(
                    bpStatus = bpItem.bpStatus
                )
                Spacer(Modifier.width(12.dp))
                Image(
                    modifier = Modifier.size(14.dp),
                    imageVector = BPIcons.Heart,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(BPTheme.colors.iconRedFF637E)
                )
                Spacer(Modifier.width(2.dp))
                Text(
                    text = bpItem.pulse.toString(),
                    color = BPTheme.colors.textPrimaryLight,
                    style = BPTheme.typography.bold14,
                )
            }
        }
    }
}


@Preview
@Composable
private fun HistoryItemPreview() {
    HistoryItem(
        Modifier.fillMaxWidth(),
        BPItem()
    )
}
