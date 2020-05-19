package com.example.fillupcartridge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickHP(view: View){
        val intent = Intent(this, HpActivity::class.java)
        startActivity(intent)
    }
    fun onClickKyo(view: View) {
        val intent = Intent(this, KyoActivity::class.java)
        startActivity(intent)

    }
    fun onClickCan(view: View) {
        val intent = Intent(this, CanonActivity::class.java)
        startActivity(intent)
    }
}
