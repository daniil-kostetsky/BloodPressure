package com.example.bloodpressure.presentation.ui.icons

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

val BPIcons.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = Builder(name = "Chart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF009966)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                horizontalLineTo(19.52f)
                curveTo(19.083f, 11.999f, 18.658f, 12.141f, 18.309f, 12.405f)
                curveTo(17.961f, 12.669f, 17.708f, 13.039f, 17.59f, 13.46f)
                lineTo(15.24f, 21.82f)
                curveTo(15.225f, 21.872f, 15.193f, 21.917f, 15.15f, 21.95f)
                curveTo(15.107f, 21.983f, 15.054f, 22.0f, 15.0f, 22.0f)
                curveTo(14.946f, 22.0f, 14.893f, 21.983f, 14.85f, 21.95f)
                curveTo(14.807f, 21.917f, 14.775f, 21.872f, 14.76f, 21.82f)
                lineTo(9.24f, 2.18f)
                curveTo(9.225f, 2.128f, 9.193f, 2.082f, 9.15f, 2.05f)
                curveTo(9.107f, 2.018f, 9.054f, 2.0f, 9.0f, 2.0f)
                curveTo(8.946f, 2.0f, 8.893f, 2.018f, 8.85f, 2.05f)
                curveTo(8.807f, 2.082f, 8.775f, 2.128f, 8.76f, 2.18f)
                lineTo(6.41f, 10.54f)
                curveTo(6.292f, 10.959f, 6.041f, 11.328f, 5.695f, 11.592f)
                curveTo(5.348f, 11.856f, 4.925f, 11.999f, 4.49f, 12.0f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _chart!!
    }

private var _chart: ImageVector? = null
