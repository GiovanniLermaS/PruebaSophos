package com.example.testing.retofit

import com.example.testing.db.model.Comment
import com.example.testing.db.model.Post
import com.example.testing.db.model.User
import com.example.testing.utils.COMMENTS
import com.example.testing.utils.POSTS
import com.example.testing.utils.USERS
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET(POSTS)
    fun getPosts(): Call<ArrayList<Post>>

    @GET
    fun getComments(@Query(COMMENTS) postId: String?): Call<ArrayList<Comment>>

    @GET
    fun getUsers(@Query(USERS) id: String?): Call<ArrayList<User>>
}