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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var counter by remember { mutableIntStateOf(0) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(padding),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = counter.toString(),
            modifier = Modifier.padding(vertical = 16.dp),
        )

        Button(onClick = { counter++ }) {
            Text("Increase")
        }
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        Button(onClick = { counter-- }) {
            Text("Decrease")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    VigilantguacamoleTheme {
        TwoButtons(PaddingValues())
    }
}
