package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        terima dan tampilkan data dari etName di activity_second dan tampilkan paada txtUsername

//        saat tombol btnKeluar di klik maka halaman akan berganti ke halaman acrivity_third
// dan akan muncul Toast “You have
//successfully logged out”

        // Receive and display data from etName in activity_second
        val username = intent.getStringExtra("USERNAME")
        binding.txtUsername.text = username

        // Handle button click to navigate to activity_third and show toast message
        binding.btnKeluar.setOnClickListener {
            Toast.makeText(this, "You have successfully logged out", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, third::class.java)
            startActivity(intent)
        }
    }
}