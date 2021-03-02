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
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.MockData
import com.example.androiddevchallenge.ui.common.DogDescription
import com.example.androiddevchallenge.ui.common.HalfScreenImage
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {

    companion object {

        const val KEY_EXTRA_DOG = "dog"

        fun getIntent(context: Context, dog: Dog): Intent {
            return Intent(context, DetailActivity::class.java).apply {
                putExtra(KEY_EXTRA_DOG, dog)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dog = intent.getParcelableExtra(KEY_EXTRA_DOG) ?: MockData.bagel
        setContent {
            MyTheme {
                DogDetailScreen(dog)
            }
        }
    }
}

@Composable
fun DogDetailScreen(dog: Dog) {
    Surface(color = MaterialTheme.colors.background) {
        Column {
            HalfScreenImage(
                Modifier.weight(1f),
                dog.image
            )

            Column(modifier = Modifier.weight(1f)) {
                DogDescription(dog = dog, false)
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
private fun DogDetailScreenPreview() {
    MyTheme {
        DogDetailScreen(dog = MockData.marky)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
private fun DogDetailScreenPreviewDark() {
    MyTheme(darkTheme = true) {
        DogDetailScreen(dog = MockData.marky)
    }
}
