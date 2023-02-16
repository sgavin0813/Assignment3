package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExerciseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expanded_exercise)
        val image:ImageView = findViewById(R.id.image)
        val name:TextView = findViewById(R.id.name)
        val group:TextView = findViewById(R.id.group)
        val desc:TextView = findViewById(R.id.desc)

        val bundle: Bundle?= intent.extras
        val nameGet = bundle!!.getString("name")
        val groupGet = bundle!!.getString("group")
        val imageGet =  bundle!!.getInt("image")
        image.setImageResource(imageGet)
        name.text = nameGet
        group.text = groupGet
        desc.text = getString(R.string.bench_press )
    }
}