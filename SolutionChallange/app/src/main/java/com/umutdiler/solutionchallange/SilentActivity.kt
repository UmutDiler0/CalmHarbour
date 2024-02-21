package com.umutdiler.solutionchallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.umutdiler.solutionchallange.databinding.ActivitySilentBinding

class SilentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding : ActivitySilentBinding

        super.onCreate(savedInstanceState)
        binding = ActivitySilentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun startSilent(view : View){
        Toast.makeText(this@SilentActivity,"Silent Mode Activated",Toast.LENGTH_LONG).show()
    }
    fun stopSilent(view : View){
        Toast.makeText(this@SilentActivity,"Silent Mode Deactivated",Toast.LENGTH_LONG).show()
    }
}