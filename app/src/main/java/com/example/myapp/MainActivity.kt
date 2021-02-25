package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit // androidx.fragment:fragment-ktx

/** Main activity for this application. */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMainFragment()
    }

    private fun showMainFragment() {
        supportFragmentManager.commit {
            add(R.id.fragment_container, MainFragment.newInstance())
            //addToBackStack(null)
        }
    }
}

