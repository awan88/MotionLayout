package com.example.motionlayout.onscroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motionlayout.databinding.ActivityMainBinding
import com.example.motionlayout.databinding.ActivityMotionOnscrollBinding

class MotionOnscrollActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMotionOnscrollBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotionOnscrollBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}