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
package com.example.androiddevchallenge.ui.screen

import android.content.Context
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.MockData
import com.example.androiddevchallenge.ui.common.DogItem
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                ListingScreen()
            }
        }
    }
}

private fun navigateToDetail(context: Context, dog: Dog) {
    val intent = DetailActivity.getIntent(context, dog)
    context.startActivity(intent)
}

// Start building your app here!
@Composable
fun ListingScreen() {
    val context = LocalContext.current

    Surface(color = MaterialTheme.colors.background) {
        LazyColumn {
            items(MockData.list) { dog ->
                DogItem(dog = dog) { navigateToDetail(context, dog) }
            }
        }
    }
}

@Composable
fun DetailButton(context: Context) {
    Button(
        onClick = {
            navigateToDetail(context, MockData.bagel)
        },
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
    ) {
        Text(text = "Go to Detail")
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        ListingScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        ListingScreen()
    }
}
