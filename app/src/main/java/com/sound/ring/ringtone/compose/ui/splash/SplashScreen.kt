package com.sound.ring.ringtone.compose.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sound.ring.ringtone.compose.R
import com.sound.ring.ringtone.compose.ui.theme.Black
import com.sound.ring.ringtone.compose.ui.theme.Transparent
import com.sound.ring.ringtone.compose.ui.theme.White
import com.sound.ring.ringtone.compose.utils.adaptiveIconPainterResource

@Composable
fun SplashScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
            .padding(20.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f)
        ) {
            Image(
                painter = adaptiveIconPainterResource(R.mipmap.ic_launcher),
                modifier = Modifier.size(100.dp),
                contentDescription = "Icon Splash"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = stringResource(R.string.app_name),
                modifier = Modifier.background(Transparent),
                color = White,
                fontSize = 30.sp
            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            LinearProgressIndicator(
                color = White,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(RoundedCornerShape(50))
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "The action may contain advertising",
                color = Color.LightGray,
                fontSize = 12.sp,
            )
        }

    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}
