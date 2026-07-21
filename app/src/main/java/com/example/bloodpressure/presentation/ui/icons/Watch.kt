package com.example.bloodpressure.presentation.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.bloodpressure.ui.BPIcons

val BPIcons.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
                viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6A7282)),
                        strokeLineWidth = 1.16667f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(7.0f, 12.833f)
                    curveTo(10.222f, 12.833f, 12.833f, 10.222f, 12.833f, 7.0f)
                    curveTo(12.833f, 3.778f, 10.222f, 1.167f, 7.0f, 1.167f)
                    curveTo(3.778f, 1.167f, 1.167f, 3.778f, 1.167f, 7.0f)
                    curveTo(1.167f, 10.222f, 3.778f, 12.833f, 7.0f, 12.833f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF6A7282)),
                        strokeLineWidth = 1.16667f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(7.0f, 3.5f)
                    verticalLineTo(7.0f)
                    lineTo(9.333f, 8.167f)
                }
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
