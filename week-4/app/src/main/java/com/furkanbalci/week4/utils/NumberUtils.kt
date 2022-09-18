package com.furkanbalci.week4.utils

object NumberUtils {

    fun decompose(value: Any?): String {
        return value?.toString()?.replace("(?<=\\d)(?=(\\d\\d\\d)+(?!\\d))".toRegex(), ".") ?: "0"
    }

}