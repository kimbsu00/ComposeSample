package com.compse.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.compse.sample.ui.theme.ComposeSampleTheme
import com.compse.sample.ui.theme.TextColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImageAndTitle()
                }
            }
        }
    }
}

@Composable
fun ImageAndTitle() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .padding(start = Dp(10f), top = Dp(5f), end = Dp(10f), bottom = Dp(5f))
    ) {
        Box(modifier = Modifier.background(MaterialTheme.colors.primary)) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Android Logo Background"
            )
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Android Logo Foreground"
            )
        }

        MessageCard(pMsg = "Android Logo Image")
    }
}

@Composable
fun MessageCard(pMsg: String) {
    Text(
        text = pMsg,
        color = TextColor,
        fontSize = dp2sp(dp = 12f.dp),
        fontFamily = FontFamily.Serif
    )
}

@Composable
fun dp2sp(dp: Dp) = with(LocalDensity.current) { dp.toSp() }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeSampleTheme {
        MessageCard("Android")
    }
}

@Preview(showBackground = false)
@Composable
fun SecondPreview() {
    ComposeSampleTheme {
        MessageCard(pMsg = "Second Preview")
    }
}