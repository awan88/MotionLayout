package com.example.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.example.motionlayout.databinding.ActivityMainBinding
import com.example.motionlayout.onclick.MotionOnclickActivity
import com.example.motionlayout.onscroll.MotionOnscrollActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initView()

    }

    private fun initView() {
        binding.btnModtionClick.setOnClickListener {
            val intent = Intent(this, MotionOnclickActivity::class.java)
            val transitionName = this.getString(R.string.transition_string)
            val p2 = Pair.create<View, String>(binding.btnModtionClick, transitionName)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, p2)
            ActivityCompat.startActivity(this, intent, options.toBundle())
        }

        binding.btnMotionOnscroll.setOnClickListener {
            val intent = Intent(this, MotionOnscrollActivity::class.java)
            val transitionName = this.getString(R.string.transition_string)
            val p2 = Pair.create<View, String>(binding.btnModtionClick, transitionName)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, p2)
            ActivityCompat.startActivity(this, intent, options.toBundle())
        }
    }
}