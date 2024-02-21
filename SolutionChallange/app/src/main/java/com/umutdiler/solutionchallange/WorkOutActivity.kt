package com.umutdiler.solutionchallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.umutdiler.solutionchallange.databinding.ActivityWorkOutBinding

class WorkOutActivity : AppCompatActivity() {

    lateinit var binding : ActivityWorkOutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkOutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun Start(view : View)
    {
        Toast.makeText(this@WorkOutActivity,"WorkOut Mode Activated",Toast.LENGTH_LONG).show()
    }
    fun Stop(view : View)
    {
        Toast.makeText(this@WorkOutActivity,"WorkOut Mode Deactivated",Toast.LENGTH_LONG).show()
    }
}