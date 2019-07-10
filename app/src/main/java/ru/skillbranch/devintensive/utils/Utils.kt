package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {

        val firstName: String?
        val lastName: String?

        if (fullName == null){
            firstName = "null"
            lastName = "null"
        }else if (fullName == ""){
            firstName = "null"
            lastName = "null"
        }else if (fullName == " "){
            firstName = "null"
            lastName = "null"
        }else {
            val parts: List<String>? = fullName.split(" ") // Разделяем fullName на две переменных
            firstName = parts?.getOrNull(0) ?: "null" // Переменная 1
            lastName = parts?.getOrNull(1) ?: "null"  // Переменная 2
        }

        return firstName to lastName
    }
}