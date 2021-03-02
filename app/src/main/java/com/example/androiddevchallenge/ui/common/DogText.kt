/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
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
fun DogDescription(dog: Dog, isListingScreen: Boolean) {

    val typography = MaterialTheme.typography
    val textStyle = if (isListingScreen) typography.h6 else typography.h3

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = dog.name,
            style = textStyle,
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
            Column {
                DogDescription(dog = MockData.marky, false)
                DogDescription(dog = MockData.snow, true)
            }
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
