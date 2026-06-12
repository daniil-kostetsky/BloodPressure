package com.example.bloodpressure.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.bloodpressure.ui.BPIcons

val BPIcons.Heart: ImageVector
    get() {
        if (_icon != null) {
            return _icon!!
        }
        _icon = Builder(
            name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
//                fill = SolidColor(Color(0xFFFFFFFF)),
                stroke = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 14.0f)
                curveTo(20.49f, 12.54f, 22.0f, 10.79f, 22.0f, 8.5f)
                curveTo(22.0f, 7.041f, 21.42f, 5.642f, 20.389f, 4.611f)
                curveTo(19.358f, 3.579f, 17.959f, 3.0f, 16.5f, 3.0f)
                curveTo(14.74f, 3.0f, 13.5f, 3.5f, 12.0f, 5.0f)
                curveTo(10.5f, 3.5f, 9.26f, 3.0f, 7.5f, 3.0f)
                curveTo(6.041f, 3.0f, 4.642f, 3.579f, 3.611f, 4.611f)
                curveTo(2.579f, 5.642f, 2.0f, 7.041f, 2.0f, 8.5f)
                curveTo(2.0f, 10.8f, 3.5f, 12.55f, 5.0f, 14.0f)
                lineTo(12.0f, 21.0f)
                lineTo(19.0f, 14.0f)
                close()
            }
        }
            .build()
        return _icon!!
    }

private var _icon: ImageVector? = null
