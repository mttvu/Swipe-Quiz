package com.example.swipequiz

data class Question(
    var question: String,
    var answer: String
){
    companion object{
        val QUESTIONS = arrayOf("test",
                "test 2",
                "test 3")
        val ANSWERS = arrayOf("true",
                "false",
                "true")
    }
}