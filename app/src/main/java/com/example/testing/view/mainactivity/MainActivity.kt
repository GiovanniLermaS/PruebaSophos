package com.example.testing.view.mainactivity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testing.R
import com.example.testing.databinding.ActivityMainBinding
import com.example.testing.view.mainactivity.adapters.TabLayoutAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener


class MainActivity : AppCompatActivity(), TabLayout.OnTabSelectedListener {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val adapter = TabLayoutAdapter(this, supportFragmentManager, binding?.tl?.tabCount)
        binding?.vp?.adapter = adapter
        binding?.vp?.addOnPageChangeListener(TabLayoutOnPageChangeListener(binding?.tl))
        binding?.tl?.setOnTabSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_activity_actions, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_reload -> {
                Toast.makeText(this, "Si funciona me lo quedo", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onTabSelected(tab: TabLayout.Tab?) {
        tab?.let { binding?.vp?.currentItem = it.position }
    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {
        TODO("Not yet implemented")
    }

    override fun onTabReselected(tab: TabLayout.Tab?) {
        TODO("Not yet implemented")
    }
}