package com.example.myapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment : Fragment(R.layout.fragment_main) {
    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }
}
