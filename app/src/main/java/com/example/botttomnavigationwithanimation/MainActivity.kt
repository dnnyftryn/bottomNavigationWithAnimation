package com.example.botttomnavigationwithanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.botttomnavigationwithanimation.presentation.BottomNavNoAnimation
import com.example.botttomnavigationwithanimation.presentation.Screen
import com.example.botttomnavigationwithanimation.ui.theme.BotttomNavigationWithAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val screen = listOf(
                Screen.Home,
                Screen.Create,
                Screen.Profile,
                Screen.Settings
            )
            BotttomNavigationWithAnimationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Row(
                        verticalAlignment = Alignment.Bottom
                    ) {
                        BottomNavNoAnimation(screens = screen)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BotttomNavigationWithAnimationTheme {
        Greeting("Android")
    }
}