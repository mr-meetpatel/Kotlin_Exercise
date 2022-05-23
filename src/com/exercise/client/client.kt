package com.exercise.client

import com.exercise.hello.sayHi

fun getName(){
    println("Enter Name : ")
    val name= readLine()?:""
    sayHi(name)
}