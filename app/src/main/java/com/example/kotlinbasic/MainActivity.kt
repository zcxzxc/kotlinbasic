package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnLog.setOnClickListener {
            Log.d("Main","Clicked Log Btn")
        }
        binding.btntoast.setOnClickListener {
            Toast.makeText(this, "토스트 클릭됨", Toast.LENGTH_SHORT).show()
        }
    }
}