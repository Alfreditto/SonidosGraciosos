package com.example.sonidosgraciosos

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var botonCangrejo: Button
    private lateinit var botonBob: Button
    private lateinit var botonCalamar: Button
    private lateinit var botonChupete: Button
    private lateinit var botonCositas: Button
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botonCangrejo = findViewById(R.id.btnKrab)
        botonBob = findViewById(R.id.btnSpongeBob)
        botonCalamar = findViewById(R.id.btnSquidward)
        botonChupete = findViewById(R.id.btnMaggie)
        botonCositas = findViewById(R.id.btnCositas)
        botonCangrejo.setOnClickListener {
            cambiarPlayer(R.raw.mr_krab)
            mediaPlayer?.start()
        }
        botonBob.setOnClickListener {
            cambiarPlayer(R.raw.esponja_sad)
            mediaPlayer?.start()
        }
        botonCalamar.setOnClickListener {
            cambiarPlayer(R.raw.squidward)
            mediaPlayer?.start()
        }
        botonChupete.setOnClickListener {
            cambiarPlayer(R.raw.chupete)
            mediaPlayer?.start()
        }
        botonCositas.setOnClickListener {
            cambiarPlayer(R.raw.drogas)
            mediaPlayer?.start()
        }

    }

    private fun cambiarPlayer(media: Int) {
        mediaPlayer = if (mediaPlayer != null) {
            if (mediaPlayer!!.isPlaying) {
                mediaPlayer!!.stop()
                MediaPlayer.create(this, media)
            } else {
                MediaPlayer.create(this, media)
            }
        } else {
            MediaPlayer.create(this, media)
        }
    }
}