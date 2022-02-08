package com.example.testing.viewmodel

import androidx.lifecycle.ViewModel
import com.example.testing.db.model.Post
import com.example.testing.repository.IMainActivityRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val mainActivityRepository: IMainActivityRepository) :
    ViewModel() {
    fun getPostsV(response: (ArrayList<Post>) -> Unit, error: (String?) -> Unit) {
        mainActivityRepository.getPostsR({ response(it) }, { error(it) })
    }
}