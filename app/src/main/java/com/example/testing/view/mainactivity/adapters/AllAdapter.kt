package com.example.testing.view.mainactivity.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testing.databinding.ViewPostBinding
import com.example.testing.db.model.Post

class AllAdapter(private val posts: ArrayList<Post>) :
    RecyclerView.Adapter<AllAdapter.ViewHolder>() {

    private var binding: ViewPostBinding? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(post: Post) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ViewPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding?.root!!)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(posts[position])
    }

    override fun getItemCount() = posts.size
}