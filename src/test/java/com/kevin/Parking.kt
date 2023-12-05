package com.kevin

import java.time.Duration
import java.time.LocalDateTime
import kotlin.math.floor

fun main() {
    val enter = LocalDateTime.of(2023, 11, 27, 8, 0, 0)
    val leave = LocalDateTime.of(2023, 11, 27, 10, 38, 0)
    val car = Car("AAA-0001", enter)
    car.leave = leave
    var hours = floor(car.duration() / 60.0).toLong()
    println(car.id + " parked for " + car.duration() + " minutes")
    val minutes = car.duration() % 60
    if (minutes > 30){
        hours++
    }
    println(car.id + " parking fee: " + hours * 30)
}

class Car(val id: String, private val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value)) {
                field = value
            }
        }
    fun duration() = (leave?.let { Duration.between(enter, it).toMinutes() } ?: 0)
}