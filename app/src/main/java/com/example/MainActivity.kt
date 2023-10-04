package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.paymentintegration.InAppActivity
import com.example.paymentintegration.R
import com.example.paymentintegration.RazorActivity
import com.example.paymentintegration.StripeActivity
import com.example.paymentintegration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnRazorPay.setOnClickListener {
            startActivity(Intent(this, RazorActivity::class.java))
        }
        binding.btnStrip.setOnClickListener {
            startActivity(Intent(this, StripeActivity::class.java))
        }
        binding.btnInApp.setOnClickListener {
            startActivity(Intent(this, InAppActivity::class.java))
        }
    }
}