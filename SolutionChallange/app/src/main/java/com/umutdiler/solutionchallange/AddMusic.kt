package com.umutdiler.solutionchallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.umutdiler.solutionchallange.databinding.ActivityAddMusicBinding

class AddMusic : AppCompatActivity() {

    lateinit var binding : ActivityAddMusicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddMusicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun Add(view : View)
    {
        Toast.makeText(this@AddMusic,"Your music added",Toast.LENGTH_LONG).show()
    }
}