package com.umutdiler.solutionchallange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.umutdiler.solutionchallange.databinding.ActivityMainBinding
import android.os.Handler
import java.util.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var runnable = Runnable{}
    var handler : Handler = Handler(Looper.getMainLooper())
    var randomPulse : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var randomPulse = Random()

        runnable = object : Runnable{
            override fun run() {
                var randomIndex = randomPulse.nextInt(40) + 80
                binding.pulseText.text = "Your Pulse : ${randomIndex.toString()}"
                handler.postDelayed(this,3000)
            }


        }
        handler.post(runnable)
    }


    fun playMusic(view : View)
    {

    }
    fun addMusic(view : View)
    {
        val intent = Intent(this@MainActivity,AddMusic::class.java)
        startActivity(intent)
    }
    fun workoutButton(view : View)
    {
        val intent3 = Intent(this@MainActivity,WorkOutActivity::class.java)
        startActivity(intent3)
    }
    fun showPictures(view : View)
    {

    }
    fun SOS(view : View){
        Toast.makeText(this@MainActivity,"Your made an emergency call",Toast.LENGTH_LONG).show()
    }
    fun silent(view : View)
    {
        val intent2 = Intent(this@MainActivity,SilentActivity::class.java)
        startActivity(intent2)
    }

}






