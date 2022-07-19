package com.benny.uicomponents2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressbarCircular: ProgressBar = findViewById(R.id.progressBarCircular)
        val progressbarHorizontal: ProgressBar = findViewById(R.id.progressBarHorizontal)
        val buttonToggle: Button = findViewById(R.id.buttonToggle)
        val buttonScroll: Button = findViewById(R.id.buttonScroll)

        buttonToggle.setOnClickListener {
            if (progressbarCircular.isVisible) {
                progressbarCircular.visibility = View.GONE
                progressbarHorizontal.visibility = View.GONE

            } else {
                progressbarCircular.visibility = View.VISIBLE
                progressbarHorizontal.visibility = View.VISIBLE
            }
        }

        buttonScroll.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}