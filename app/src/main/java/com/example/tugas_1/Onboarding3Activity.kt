package com.example.tugas_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding3Activity : AppCompatActivity() {

    private lateinit var buttonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        buttonNext = findViewById(R.id.buttonNext)
        buttonNext.setOnClickListener {
            // Mengarahkan ke halaman berikutnya atau melakukan tindakan lainnya
            navigateToNextPage()
        }
    }

    private fun navigateToNextPage() {
        // Logika untuk mengarahkan ke halaman berikutnya atau melakukan tindakan lainnya
        // Contoh: Mengarahkan ke halaman login setelah halaman onboarding selesai
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish() // Menutup halaman onboarding agar tidak dapat dikembalikan dengan tombol kembali
    }
}