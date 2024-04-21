package com.bloodlabs.admin.ui.uploads

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bloodlabs.admin.theme.BloodlabsTheme
import com.bloodlabs.admin.theme.BloodlabsThemeComposable
import com.bloodlabs.admin.theme.myPrimary

@Composable
fun Uploads(homeNavController: NavController) {
    BloodlabsThemeComposable {

            val shape = RoundedCornerShape(24.dp) // Adjust corner size as needed


            Column(modifier = Modifier.fillMaxSize().padding(8.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth().padding(BloodlabsTheme.sizes.medium)
                        .weight(1f)
                        .clickable {
                        /* Navigate to Upload Images screen */ }
                        .background(color = myPrimary, shape = shape),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Upload Images", color = Color.White, fontSize = 24.sp,fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif)
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth().padding(BloodlabsTheme.sizes.medium)
                        .weight(1f)
                        .clickable { /* Navigate to Upload Description screen */ }
                        .background(color = myPrimary, shape = shape),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Upload Description", color = Color.White, fontSize = 24.sp,fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif)
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth().padding(BloodlabsTheme.sizes.medium)
                        .weight(1f)
                        .clickable { /* Navigate to Upload Other screen */ }
                        .background(color = myPrimary, shape = shape),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Upload Other", color = Color.White, fontSize = 24.sp,fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif)
                }
            }


    }

}