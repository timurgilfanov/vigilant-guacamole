package timur.gilfanov.guacamole

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import timur.gilfanov.guacamole.ui.theme.VigilantguacamoleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VigilantguacamoleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TwoButtons(innerPadding)
                }
            }
        }
    }
}

@Composable
fun TwoButtons(padding: PaddingValues, modifier: Modifier = Modifier) {
    val counter = remember { mutableStateOf(0) }
    
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(padding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = counter.value.toString(),
            modifier = Modifier.padding(vertical = 16.dp)
        )
        
        Button(onClick = { counter.value++ }) {
            Text("Increase")
        }
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        Button(onClick = { counter.value-- }) {
            Text("Decrease")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    VigilantguacamoleTheme {
        Greeting("Android")
    }
}
