package com.example.bloodpressure.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
//    primary = SurfaceLightGreen,
//    secondary = PurpleGrey40,
//    tertiary = Pink40,
//    background = SurfaceLightGreen,
//    surfaceContainer = WhiteMilk

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun BloodPressureTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }
//
//        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

//Hero Numbers (Blood Pressure Values)
//Dashboard — Systolic Value (text-6xl font-black tracking-tighter)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Black,
//fontStyle = FontStyle.Normal,
//fontSize = 60.sp,
//lineHeight = 60.sp,
//letterSpacing = (-3.0).sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Add Reading — Stepper Value (text-5xl font-black tracking-tighter)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Black,
//fontStyle = FontStyle.Normal,
//fontSize = 48.sp,
//lineHeight = 48.sp,
//letterSpacing = (-2.4).sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Dashboard — Diastolic Value (text-5xl font-extrabold)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.ExtraBold,
//fontStyle = FontStyle.Normal,
//fontSize = 48.sp,
//lineHeight = 48.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Dashboard & History — Large Separators ( / ) (text-4xl font-bold)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Bold,
//fontStyle = FontStyle.Normal,
//fontSize = 36.sp,
//lineHeight = 40.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//2. Headers & Titles
//All Screens — Main Page Header (text-3xl font-extrabold)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.ExtraBold,
//fontStyle = FontStyle.Normal,
//fontSize = 30.sp,
//lineHeight = 36.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Settings & Add Reading — Main Buttons, Prominent Labels (text-2xl font-bold)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Bold,
//fontStyle = FontStyle.Normal,
//fontSize = 24.sp,
//lineHeight = 32.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Dashboard & Analytics — Card Titles / Section Headers (text-xl font-bold)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Bold,
//fontStyle = FontStyle.Normal,
//fontSize = 20.sp,
//lineHeight = 28.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//3. Body & Subtitles
//All Screens — Page Subtitles / Text Inputs (text-lg font-normal)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Normal,
//fontStyle = FontStyle.Normal,
//fontSize = 18.sp,
//lineHeight = 28.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Dashboard & Add Reading — Status Badges & Input Labels (text-lg font-bold)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Bold,
//fontStyle = FontStyle.Normal,
//fontSize = 18.sp,
//lineHeight = 28.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Settings — Row Item Labels (text-base font-bold)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Bold,
//fontStyle = FontStyle.Normal,
//fontSize = 16.sp,
//lineHeight = 24.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Settings — Row Item Values (text-base font-medium)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Medium,
//fontStyle = FontStyle.Normal,
//fontSize = 16.sp,
//lineHeight = 24.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//4. Small Labels & Meta Text
//Dashboard & History — Timestamps / Minor Labels (text-sm font-medium)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Medium,
//fontStyle = FontStyle.Normal,
//fontSize = 14.sp,
//lineHeight = 20.sp,
//letterSpacing = 0.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Dashboard — Pulse/Atm Box Labels (Uppercase) (text-sm font-medium tracking-wide)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Medium,
//fontStyle = FontStyle.Normal,
//fontSize = 14.sp,
//lineHeight = 20.sp,
//letterSpacing = 0.35.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//History — Status Badge Labels (Uppercase) (text-xs font-bold tracking-wider)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Bold,
//fontStyle = FontStyle.Normal,
//fontSize = 12.sp,
//lineHeight = 16.sp,
//letterSpacing = 0.6.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)
//Bottom Navigation — Tab Labels (Uppercase) (text-[10px] tracking-wider)
//
//TextStyle(
//fontFamily = FontFamily.Default,
//fontWeight = FontWeight.Normal,
//fontStyle = FontStyle.Normal,
//fontSize = 10.sp,
//lineHeight = 14.sp,
//letterSpacing = 0.5.sp,
//lineHeightStyle = LineHeightStyle(alignment = LineHeightStyle.Alignment.Center, trim = LineHeightStyle.Trim.None)
//)