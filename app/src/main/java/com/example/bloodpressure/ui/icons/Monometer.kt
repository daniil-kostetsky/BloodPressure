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

val BPIcons.Monometer: ImageVector
    get() {
        if (_monometer != null) {
            return _monometer!!
        }
        _monometer = Builder(name = "Monometer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF51A2FF)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                lineTo(16.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF51A2FF)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.34f, 19.0f)
                curveTo(2.462f, 17.48f, 2.0f, 15.755f, 2.0f, 14.0f)
                curveTo(2.0f, 12.245f, 2.462f, 10.52f, 3.34f, 9.0f)
                curveTo(4.217f, 7.48f, 5.48f, 6.217f, 7.0f, 5.339f)
                curveTo(8.52f, 4.462f, 10.245f, 4.0f, 12.0f, 4.0f)
                curveTo(13.755f, 4.0f, 15.48f, 4.462f, 17.0f, 5.339f)
                curveTo(18.52f, 6.217f, 19.783f, 7.48f, 20.66f, 9.0f)
                curveTo(21.538f, 10.52f, 22.0f, 12.245f, 22.0f, 14.0f)
                curveTo(22.0f, 15.755f, 21.538f, 17.48f, 20.66f, 19.0f)
            }
        }
        .build()
        return _monometer!!
    }

private var _monometer: ImageVector? = null
