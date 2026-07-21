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

val BPIcons.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(
            name = "Calendar", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
            viewportWidth = 14.0f, viewportHeight = 14.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6A7282)),
                strokeLineWidth = 1.16667f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.667f, 1.167f)
                verticalLineTo(3.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6A7282)),
                strokeLineWidth = 1.16667f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.333f, 1.167f)
                verticalLineTo(3.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6A7282)),
                strokeLineWidth = 1.16667f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.083f, 2.333f)
                horizontalLineTo(2.917f)
                curveTo(2.272f, 2.333f, 1.75f, 2.856f, 1.75f, 3.5f)
                verticalLineTo(11.667f)
                curveTo(1.75f, 12.311f, 2.272f, 12.833f, 2.917f, 12.833f)
                horizontalLineTo(11.083f)
                curveTo(11.728f, 12.833f, 12.25f, 12.311f, 12.25f, 11.667f)
                verticalLineTo(3.5f)
                curveTo(12.25f, 2.856f, 11.728f, 2.333f, 11.083f, 2.333f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6A7282)),
                strokeLineWidth = 1.16667f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(1.75f, 5.833f)
                horizontalLineTo(12.25f)
            }
        }
            .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
