package com.example.androiddevchallenge.ui.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
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