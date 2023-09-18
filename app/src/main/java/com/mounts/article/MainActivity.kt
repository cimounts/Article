package com.mounts.article

import android.os.Bundle
import android.provider.Settings.Secure.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mounts.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(getString(R.string.header), body = getString(R.string.body), getString(R.string.mainText))
                }
            }
        }
    }
}


@Composable
fun Body(header: String, body: String, mainText: String, modifier: Modifier = Modifier){
Column (verticalArrangement = Arrangement.Center, modifier = modifier){
    Text(
        text = header,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)


    )
    Text(
        text = body,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)
    )
    Text(
        text = mainText,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)

    )
}

}
@Composable
fun Greeting(header: String, body: String, mainText: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,

            contentDescription = null
            )
        Body(
            header = header,
            body = body,
            mainText = mainText,
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleTheme {
        Greeting(stringResource(R.string.header), stringResource(R.string.body), stringResource(R.string.mainText))

    }
}