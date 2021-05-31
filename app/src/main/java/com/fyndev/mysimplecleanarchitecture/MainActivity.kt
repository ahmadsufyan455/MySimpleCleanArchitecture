package com.fyndev.mysimplecleanarchitecture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.fyndev.mysimplecleanarchitecture.databinding.ActivityMainBinding
import com.fyndev.mysimplecleanarchitecture.presentation.MainViewModel
import com.fyndev.mysimplecleanarchitecture.presentation.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.setName("Fyan")
        viewModel.message.observe(this, {
            binding.tvWelcome.text = it.welcomeMessage
        })
    }
}