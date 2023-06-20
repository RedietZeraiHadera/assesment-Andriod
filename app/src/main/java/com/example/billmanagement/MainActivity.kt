package com.example.billmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.billmanagement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        displayPerson()

        binding.rvBills.setOnClickListener {
            val intent = Intent(this, BillsList::class.java)
            startActivity(intent)
        }

    }
    fun displayPerson(){
        val person1 = BillsList("RedietZerai","0927444862","redietzerai@gmail.com","qw2020")
        val person2 = BillsList("ShalomZerai","0927444862","redietzerai@gmail.com","qw2020")

        val personLists = mutableListOf(person1,person2)

        var billList= listOf<BillsList>(person1,person2)
        binding.rvBills.layoutManager=LinearLayoutManager(this)
        var adapter= Adapter(billList)
        binding.rvBills.adapter=adapter

    }

}