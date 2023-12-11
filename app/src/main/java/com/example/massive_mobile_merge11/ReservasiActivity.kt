package com.example.massive_mobile_merge11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.massive_mobile_merge11.databinding.ActivityReservasiBinding

class ReservasiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReservasiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReservasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPemUmum.setOnClickListener {
            val intent = Intent(this, FormulirPasienActivity::class.java)
            startActivity(intent)
        }

        binding.btnImunisasi.setOnClickListener {
            val intent = Intent(this, FormulirPasienActivity::class.java)
            startActivity(intent)
        }

        binding.btnPoliAnak.setOnClickListener {
            val intent = Intent(this, FormulirPasienActivity::class.java)
            startActivity(intent)
        }

        binding.btnPosyandu.setOnClickListener {
            val intent = Intent(this, FormulirPasienActivity::class.java)
            startActivity(intent)
        }

        binding.btnPoliGigi.setOnClickListener {
            val intent = Intent(this, FormulirPasienActivity::class.java)
            startActivity(intent)
        }

        binding.btnVaksin.setOnClickListener {
            val intent = Intent(this, FormulirPasienActivity::class.java)
            startActivity(intent)
        }
    }
}
