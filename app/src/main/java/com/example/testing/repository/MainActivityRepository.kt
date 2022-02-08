package com.example.testing.repository

import com.example.testing.db.model.Post
import com.example.testing.retofit.ApiInterface
import dagger.hilt.android.scopes.ActivityRetainedScoped
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@ActivityRetainedScoped
class MainActivityRepository(private val apiInterface: ApiInterface) : IMainActivityRepository {
    override fun getPostsR(response: (ArrayList<Post>) -> Unit, error: (String?) -> Unit) {
        val call = apiInterface.getPosts()
        call.enqueue(object : Callback<ArrayList<Post>> {
            override fun onFailure(
                call: Call<ArrayList<Post>>,
                t: Throwable
            ) {
                error(t.message.toString())
            }

            override fun onResponse(
                call: Call<ArrayList<Post>>,
                responseService: Response<ArrayList<Post>>
            ) {
                responseService.body()?.let { response(it) }
            }
        })
    }
}