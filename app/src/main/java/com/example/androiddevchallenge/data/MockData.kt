package com.example.androiddevchallenge.data

object MockData {
    val marky = Dog(
        "Marky",
        "Golden Retriever",
        3,
        "https://images.unsplash.com/photo-1552053831-71594a27632d?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=612&q=80"
    )

    val elwoof = Dog(
        "Elwoof",
        "Corgi",
        1,
        "https://images.unsplash.com/photo-1537151608828-ea2b11777ee8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=639&q=80"
    )

    val bagel = Dog(
        "Bagel",
        "French Bulldog",
        5,
        "https://images.unsplash.com/photo-1583511655857-d19b40a7a54e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1349&q=80"
    )

    val snow = Dog(
        "Snow",
        "Samoyed",
        2,
        "https://images.unsplash.com/photo-1529429617124-95b109e86bb8?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=675&q=80"
    )

    val oaky = Dog(
        "Oaky",
        "Little Lion",
        4,
        "https://images.unsplash.com/photo-1575859431774-2e57ed632664?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"
    )

    val list = listOf<Dog>(marky, elwoof, bagel, snow, oaky)
}