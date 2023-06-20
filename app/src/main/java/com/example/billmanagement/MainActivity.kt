package com.example.billmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.billmanagement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    override fun onResume() {
        super.onResume()
        binding.btnSignup.setOnClickListener {
            startActivity(Intent(this,Registration::class.java)
        }
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this,Login::class.java)
        }
    }

    fun validate(){
        val name = binding.etName.text.toString()
        val phone = binding.etPhone.text.toString()
        val password = binding.etPassword.toString()
    }
}
    }


}