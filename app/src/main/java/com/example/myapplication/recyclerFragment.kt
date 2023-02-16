package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recyclerFragment : Fragment() {
    lateinit var viewToReturn:View
    private lateinit var recyclerExercise : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewToReturn=  inflater.inflate(R.layout.fragment_recycler, container, false)
        recyclerExercise = viewToReturn.findViewById<RecyclerView>(R.id.recyclerFragment)
        recyclerExercise.layoutManager = LinearLayoutManager(this.context)
        val adapter = ExerciseListAdapter(list)
        recyclerExercise.adapter = adapter
        adapter.setOnItemClickListener( object: ExerciseListAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(requireContext(),ExerciseActivity::class.java)
                intent.putExtra("name", list[position].name)
                intent.putExtra("image", list[position].image)
                intent.putExtra("group", list[position].group)
                startActivity(intent)
            }
        })

        return viewToReturn
    }


}