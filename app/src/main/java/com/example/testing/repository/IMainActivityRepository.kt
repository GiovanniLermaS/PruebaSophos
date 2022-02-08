package com.example.testing.repository

import com.example.testing.db.model.Post

interface IMainActivityRepository {
    fun getPostsR(response: (ArrayList<Post>) -> Unit, error: (String?) -> Unit)
}