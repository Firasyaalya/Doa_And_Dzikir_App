package com.Firasya.doadandzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.Firasya.doadandzikirapp.R

class DetailArtikelActivity : AppCompatActivity() {
    companion object {
        const val  DATA_TITLE = "title"
        const val DATA_DESC = "data"
        const val DATA_IMAGE = "image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Artikel Islamic"
        setContentView(R.layout.activity_detail_artikel)


        val dataTitle = intent.getStringExtra(DATA_TITLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE, 0)

        val tvTitle: TextView = findViewById(R.id.tv_detail_title)
        tvTitle.text = dataTitle
        val tvDesc: TextView = findViewById(R.id.tv_detail_desc)
        tvTitle.text = dataDesc
        val ImageArtikel: ImageView = findViewById(R.id.img_detail)
        ImageArtikel.setImageResource(dataImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}