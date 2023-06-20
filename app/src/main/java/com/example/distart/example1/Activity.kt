package com.example.distart.example1

class Activity {

    val computer: Computer = Component().getComputer()

    lateinit var computer1: Computer

    init {
        Component().inject(this)
    }

}