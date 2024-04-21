package com.bloodlabs.admin.theme
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp

private val DarkColorScheme = BloodlabsColors(
    primary = myPrimary,
    secondary = mySecodary,
    tertiary = mytertiary,
)

private val LightColorScheme = BloodlabsColors(
    primary = myPrimary,
    secondary = mySecodary,
    tertiary = mytertiary
)

private val shape = BloodlabsShapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp),
    container = RoundedCornerShape(16.dp),
    button = RoundedCornerShape(50)
)

private val size = BloodlabsSizes(
    small = 8.dp,
    medium = 16.dp,
    large = 32.dp
)

@Composable
fun BloodlabsThemeComposable(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme
    val rippleIndication = rememberRipple()

    CompositionLocalProvider(
        BloodlabsThemeColors provides colorScheme,
        BloodlabsThemeShapes provides shape,
        BloodlabsThemeSizes provides size,
        LocalIndication provides rippleIndication,
        content = content
    )
}

object BloodlabsTheme {
    val colorsScheme: BloodlabsColors
        @Composable
        get() = BloodlabsThemeColors.current
    val shapes: BloodlabsShapes
        @Composable
        get() = BloodlabsThemeShapes.current
    val sizes: BloodlabsSizes
        @Composable
        get() = BloodlabsThemeSizes.current
}
