package com.example.jetpackproject1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackproject1.ui.theme.JetpackProject1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting("Pranjal")
        }
    }
}

/**
 * Case 1
 */

/*@Preview(showSystemUi = true)
@Composable
fun Greeting(name: String = "abc") {
    Text(
        text = "Hello $name!",
    )
}*/

/**
 * Case 2
 */
@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
    )
}

// Preview without parameters, using default or hardcoded values
@Preview(showSystemUi = true)
@Composable
fun previewFunc() {
    Greeting(name = "abc") // Hardcoding value for preview
}
