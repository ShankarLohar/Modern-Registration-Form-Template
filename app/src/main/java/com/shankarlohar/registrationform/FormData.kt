package com.shankarlohar.registrationform

import java.io.Serializable

data class FormData (
    val title: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val password: String,

    ) : Serializable{
        fun getFullName() = "$title $firstName $lastName"
    }
