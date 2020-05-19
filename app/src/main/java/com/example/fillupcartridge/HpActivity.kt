package com.example.fillupcartridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_hp.*
import kotlinx.android.synthetic.main.activity_main.*

class HpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hp)
        var nameList = ArrayList<String>()
            nameList.add("1010")
            nameList.add("1320")
            nameList.add("3015")
            nameList.add("4015")
            nameList.add("1005")


        listViewHp.adapter = ArrayAdapter (this, android.R.layout.simple_list_item_1, nameList)
        //listViewHp.setOnItemClickListener { parent, view, position, id ->  }

}
}

