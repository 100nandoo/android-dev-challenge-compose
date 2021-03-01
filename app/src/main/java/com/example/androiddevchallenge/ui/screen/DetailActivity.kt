package com.example.androiddevchallenge.ui.screen

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.MockData
import com.example.androiddevchallenge.ui.common.DogDescription
import com.example.androiddevchallenge.ui.common.HalfScreenImage
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                DogDetailScreen()
            }
        }
    }
}


@Composable
fun DogDetailScreen() {
    Surface(color = MaterialTheme.colors.background) {
        Column {
            HalfScreenImage(
                Modifier.weight(1f),
                "https://images.unsplash.com/photo-1552053831-71594a27632d?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=612&q=80"
            )

            Column(modifier = Modifier.weight(1f)) {
                DogDescription(dog = MockData.marky)
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
private fun DogDetailScreenPreview() {
    MyTheme {
        DogDetailScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
private fun DogDetailScreenPreviewDark() {
    MyTheme(darkTheme = true) {
        DogDetailScreen()
    }
}