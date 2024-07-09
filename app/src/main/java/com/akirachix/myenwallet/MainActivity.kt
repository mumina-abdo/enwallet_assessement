package com.akirachix.myenwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myenwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.idMine.layoutManager = LinearLayoutManager(this)
        displayWallet()


    }

    fun displayWallet(){
        val wallety1 = Wallet("Salary", "KES 40,000")
        var wallety2 = Wallet("Rent", "KES 7,000")
        var wallety3 = Wallet("Dividends", "KES 5,000")
        var wallety4 = Wallet("Electricity", "KES 16,000")
        var wallety5 = Wallet("Internet", "KES 1,000")
        var wallety6 = Wallet("Shopping", "KES 3,000")
        var wallety7 = Wallet("Bus fare", "KES 500")
        var wallety8 = Wallet("Water bill", "KES 35,000")

        var walletMine = listOf(wallety1, wallety2, wallety3, wallety4, wallety5, wallety6, wallety7, wallety8)
        val walletc = Walletc(walletMine)
        binding.idMine.adapter = walletc
    }

}