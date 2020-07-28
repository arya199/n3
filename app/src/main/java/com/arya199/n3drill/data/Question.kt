package com.arya199.n3drill.data

data class Question(
    var Id: Int,
    var Level: String,
    var Question: String,
    var Correct: String,
    var Bogus_1: String,
    var Bogus_2: String,
    var Bogus_3: String
) {}