package com.example.fillupcartridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hp.*
import kotlinx.android.synthetic.main.activity_hp.view.*
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import java.io.File
import java.io.IOException
import java.io.InputStream

class HpActivity : AppCompatActivity() {
    var arr = arrayListOf<String>()
    var cart = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hp)
        read_json()
    }
    fun read_json()
    {
        var json: String? = null
        try {
            val inputStream: InputStream = assets.open("Habitat.json")
            json = inputStream.bufferedReader().use { it.readText() }
            val jsonArr =  JSONArray(json)

            for (i in 0..jsonArr.length()-1)
            {
                val jsonObject = jsonArr.getJSONObject(i)
                arr.add(jsonObject.getString("model"))
                cart.add(jsonObject.getString("Cartridge"))

            }
            val adpt = ArrayAdapter (this, android.R.layout.simple_list_item_1, arr)
            listViewHp.adapter = adpt

            listViewHp.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                Toast.makeText(applicationContext, "Используемый картридж:" + cart[position], Toast.LENGTH_LONG).show()
            }


        }
        catch (e: IOException) {

        }

    }


        //var nameList = ArrayList<String>()



        //listViewHp.adapter = ArrayAdapter (this, android.R.layout.simple_list_item_1, nameList)
        //listViewHp.setOnItemClickListener { parent, view, position, id ->  }

}


