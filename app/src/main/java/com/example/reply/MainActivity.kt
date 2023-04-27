
package com.example.reply
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.reply.ui.ReplyApp
import com.example.reply.ui.theme.ReplyTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReplyTheme {
                val windowSize = calculateWindowSizeClass(this)
                ReplyApp(windowsize = windowSize.widthSizeClass)
            }
        }
    }
}
@Preview(showBackground = true, widthDp = 700 )
@Composable
fun ReplyAppMediumPreview() {
    ReplyTheme {
        ReplyApp(
            windowsize = WindowWidthSizeClass.Medium
        )
    }
}
@Preview(showBackground = true, widthDp = 1000 )
@Composable
fun ReplyAppExpandedePreview() {
    ReplyTheme {
        ReplyApp(
            windowsize = WindowWidthSizeClass.Expanded

        )
    }
}