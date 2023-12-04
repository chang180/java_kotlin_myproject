package com.kevin

import java.io.File

fun main() {
//    File("output.txt").writeText("這樣就可以寫入檔案了kt")
//    write()

    // 讀取檔案
//    File("data.txt").bufferedReader().lines().forEach {
//        println(it)
//    }
    File("data.txt").readLines().forEach {
        println(it)
    }
}

private fun write() {
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}