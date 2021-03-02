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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.request.ImageRequest
import dev.chrisbanes.accompanist.coil.CoilImage

/**
 * @param modifier is column modifier
 * @param data The data to load. See [ImageRequest.Builder.data] for the types allowed.
 */
@Composable
fun HalfScreenImage(modifier: Modifier, data: Any) {
    Row(modifier = modifier) {
        CoilImage(
            contentDescription = null,
            contentScale = ContentScale.Crop,
            data = data,
        )
    }
}

@Preview
@Composable
fun HalfScreenImagePreview() {
    Column {
        HalfScreenImage(
            Modifier.weight(1f),
            "https://images.unsplash.com/photo-1552053831-71594a27632d?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=612&q=80"
        )
        Row(Modifier.weight(1f)) {}
    }
}

@Composable
fun SmallImage(data: Any) {
    CoilImage(
        modifier = Modifier
            .size(56.dp)
            .clip(CircleShape),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        data = data
    )
}

@Preview
@Composable
private fun SmallImagePreview() {
    SmallImage(data = "https://images.unsplash.com/photo-1552053831-71594a27632d?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=612&q=80")
}
