package com.example.core.data

data class Note(
    var title: String,
    var content: String,
    var creatienTime: Long,
    var updateTime: Long,
    var id: Long = 0
)