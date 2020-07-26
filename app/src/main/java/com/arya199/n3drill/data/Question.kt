package com.arya199.n3drill.data

data class Question(
    var id: Int,
    var level: String,
    var question: String,
    var correct: String,
    var bogus_1: String,
    var bogus_2: String,
    var bogsu_3: String
) {}