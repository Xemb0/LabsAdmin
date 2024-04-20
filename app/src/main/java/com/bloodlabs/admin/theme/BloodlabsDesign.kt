package com.bloodlabs.admin.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class BloodlabsColors(
//    val background: Color,
//    val onBackground: Color,
    val primary: Color,
//    val onPrimary: Color,
    val secondary: Color,
//    val onSecondary: Color,
    val tertiary: Color,
//    val onTertiary: Color,
)
data class BloodLabsTypography(
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val body: TextStyle,
    val labelLarge: TextStyle,
    val labelMedium: TextStyle,
    val labelSmall: TextStyle,
)
data class BloodlabsShapes(
    val small: Shape,
    val medium: Shape,
    val large: Shape,
    val container: Shape,
    val button: Shape,
)
data class BloodlabsSizes(
    val small: Dp,
    val medium: Dp,
    val large: Dp,)

 val BloodlabsThemeColors = staticCompositionLocalOf {
     BloodlabsColors(
//         background = Color(0xFF0A0C19),
//         onBackground = Color(0xFFFFFFFF),
         primary = Color(0xFF0A0C19),
//         onPrimary = Color(0xFFFFFFFF),
         secondary = Color(0xFF009688),
//         onSecondary = Color(0xFF0A0C19),
         tertiary = Color(0xFFFFFFFF),
//         onTertiary = Color(0xFF0A0C19),
     )
 }

val BloodlabsThemeShapes = staticCompositionLocalOf {
    BloodlabsShapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(8.dp),
        large = RoundedCornerShape(16.dp),
        container = RectangleShape,
        button = CircleShape,
    )
}
val BloodlabsThemeSizes = staticCompositionLocalOf {
    BloodlabsSizes(
        small = 4.dp,
        medium = 8.dp,
        large = 16.dp,
    )
}
