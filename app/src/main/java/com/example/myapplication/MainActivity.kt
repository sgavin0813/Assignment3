package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

var list = mutableListOf<ExerciseData>()
lateinit var desc:Array<String>
class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        initialize()
        replaceFragment(recyclerFragment())

    }


    private fun replaceFragment( currentFragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.recyclerFragmentFrame,currentFragment)
        fragmentTransaction.commit()

    }
    private fun initialize(){
        var exercises = arrayOf("Bench press", "Incline press",)
        list.add(ExerciseData("Bench press","Chest",R.drawable.benchpress))
        list.add(ExerciseData("Inclined press","Chest",R.drawable.inclined))
        list.add(ExerciseData("Bench press","Chest",R.drawable.benchpress))
        list.add(ExerciseData("Inclined press","Chest",R.drawable.inclined))
        list.add(ExerciseData("Shoulder press","Shoulder",R.drawable.sholderpress))
        list.add(ExerciseData("Shoulder press","Shoulder",R.drawable.sideraise))
        list.add(ExerciseData("Shoulder press","Shoulder",R.drawable.sholderpress))
        list.add(ExerciseData("Shoulder press","Shoulder",R.drawable.sideraise))
        list.add(ExerciseData("Lats Pulldown","Back",R.drawable.lats))
        list.add(ExerciseData("Curls","Biceps",R.drawable.curls))
        list.add(ExerciseData("Curls","Biceps",R.drawable.curls))
        list.add(ExerciseData("Curls","Biceps",R.drawable.curls))
        list.add(ExerciseData("Curls","Biceps",R.drawable.curls))
        }
    }
