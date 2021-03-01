package com.example.androiddevchallenge.ui.common

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.MockData
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DogDescription(dog: Dog) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        val typography = MaterialTheme.typography
        Text(
            text = dog.name,
            style = typography.h3,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Row(modifier = Modifier.fillMaxWidth()) {
            EmojiText(emoji = "\uD83D\uDC36", text = " ${dog.breed}", modifier = Modifier.weight(1f))
            EmojiText(emoji = "\uD83C\uDF82", text = " ${dog.age} years old", modifier = Modifier.weight(1f))
        }
    }
}

@Preview
@Composable
private fun DogDescriptionPreview() {
    MyTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            DogDescription(dog = MockData.marky)
        }
    }
}

@Composable
fun EmojiText(emoji: String, text: String, modifier: Modifier) {
    Row(modifier = modifier) {
        Row(modifier = Modifier.wrapContentWidth()) {
            Text(
                text = emoji,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Text(
                text = text,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
private fun EmojiTextPreview() {
    MyTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            val dog = MockData.marky
            Column {
                EmojiText(emoji = "\uD83C\uDF82", text = "${dog.age} years old", modifier = Modifier.weight(1f))
            }
        }
    }
}