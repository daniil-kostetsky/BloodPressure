package com.example.bloodpressure

import androidx.compose.ui.graphics.Color

data class BPItem(
    val sys: Int = 120,
    val dia: Int = 80,
    val pulse: Int = 60,
    val date: String = "18 May, 2026",
    val time: String = "22:04",
    val note: String = "",
    val atmPressure: Int = 760,
    val bpStatus: BPStatus = BPStatus.NORMAL
)
enum class BPStatusLevel(
    val label: String,
    val backgroundColor: Color,
    val textColor: Color,
    val borderColor: Color
) {
    // Bluish shades
    LOW(
        label = "Low",
        backgroundColor = Color(0xFFE1F0FA),
        textColor = Color(0xFF0D63A6),
        borderColor = Color(0xFF82C2F0)
    ),

    // Green shades
    NORMAL(
        label = "Normal",
        backgroundColor = Color(0xFFE3F7E9),
        textColor = Color(0xFF127A33),
        borderColor = Color(0xFF7ED994)
    ),

    // Golden/Amber shades (between Normal and High)
    INCREASED(
        label = "Elevated",
        backgroundColor = Color(0xFFFFF5D4),
        textColor = Color(0xFFA67B00),
        borderColor = Color(0xFFFFCF54)
    ),

    // Orange shades (Your provided example)
    HYPERTENSION_1(
        label = "High Stage 1",
        backgroundColor = Color(0xFFFFEDD4),
        textColor = Color(0xFFCA3500),
        borderColor = Color(0xFFFFB86A)
    ),

    // Red shades
    HYPERTENSION_2(
        label = "High Stage 2",
        backgroundColor = Color(0xFFFFE0E0),
        textColor = Color(0xFFC21515),
        borderColor = Color(0xFFFF8585)
    ),

    // Deep crimson / Solid red (Medical Emergency)
    CRISIS(
        label = "Crisis! Call Doctor",
        backgroundColor = Color(0xFFD91616), // Solid intense red background
        textColor = Color(0xFFFFFFFF),       // White text for maximum contrast/alarm
        borderColor = Color(0xFF8F0000)      // Dark red border
    )
}

enum class BPStatus(
    val text: String,
    val backgroundColor: Color,
    val textColor: Color,
    val borderColor: Color
) {
    LOW(
        text = "Low",
        backgroundColor = Color(0xFFE1F0FA),
        textColor = Color(0xFF0D63A6),
        borderColor = Color(0xFF82C2F0)
    ),

    // Green shades
    NORMAL(
        text = "Normal",
        backgroundColor = Color(0xFFE3F7E9),
        textColor = Color(0xFF127A33),
        borderColor = Color(0xFF7ED994)
    ),

    // Golden/Amber shades (between Normal and High)
    ELEVATED(
        text = "Elevated",
        backgroundColor = Color(0xFFFFF5D4),
        textColor = Color(0xFFA67B00),
        borderColor = Color(0xFFFFCF54)
    ),

    // Orange shades (Your provided example)
    HYPERTENSION_1(
        text = "High Stage 1",
        backgroundColor = Color(0xFFFFEDD4),
        textColor = Color(0xFFCA3500),
        borderColor = Color(0xFFFFB86A)
    ),

    // Red shades
    HYPERTENSION_2(
        text = "High Stage 2",
        backgroundColor = Color(0xFFFFE0E0),
        textColor = Color(0xFFC21515),
        borderColor = Color(0xFFFF8585)
    ),

    // Deep crimson / Solid red (Medical Emergency)
    CRISIS(
        text = "Crisis!",
        backgroundColor = Color(0xFFD91616), // Solid intense red background
        textColor = Color(0xFFFFFFFF),       // White text for maximum contrast/alarm
        borderColor = Color(0xFF8F0000)      // Dark red border
    )
}

fun getBPStatus(sys: Int, dia: Int): BPStatus = when {
    sys < 90 || dia < 60 -> BPStatus.LOW
    sys < 120 && dia < 80 -> BPStatus.NORMAL
    sys < 130 && dia < 80 -> BPStatus.ELEVATED
    sys < 140 || dia < 90 -> BPStatus.HYPERTENSION_1
    sys < 180 || dia < 120 -> BPStatus.HYPERTENSION_2
    else -> BPStatus.CRISIS
}
