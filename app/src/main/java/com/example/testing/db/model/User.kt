package com.example.testing.db.model

class User {
    var id: Int = 0
    var name: String? = ""
    var username: String? = ""
    var email: String? = ""
    var address = Address()
    var phone: String? = ""
    var website: String? = ""
}