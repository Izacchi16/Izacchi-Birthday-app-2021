package com.example.izacchi_birthday_app_2021

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

actual class IzacchiBirthday actual constructor() {
    actual fun checkBirthday(date: String): Boolean {

        // 現在時刻の取得
        val now = LocalDateTime.now()

        // フォーマットの指定
        val dtf = DateTimeFormatter.ofPattern("MM/dd")

        // 文字列の生成
        val result = now.format(dtf)

        return date == result
    }
}