package com.example.izacchi_birthday_app_2021

class BirthdayChecker {
    fun isIzacchiBirthday(date: String): Boolean {
        return IzacchiBirthday().checkBirthday(date)
    }
}