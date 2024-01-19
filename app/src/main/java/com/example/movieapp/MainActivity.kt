package com.example.movieapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val verticalRecyclerView: RecyclerView = findViewById(R.id.verticalRecyclerView)
        verticalRecyclerView.layoutManager = LinearLayoutManager(this)


        val movies = listOf(
            Movie("English", listOf(R.drawable.thor,R.drawable.wolb,R.drawable.lala,R.drawable.noah,R.drawable.poc)),
            Movie("Hindi", listOf(R.drawable.bhoot,R.drawable.ghayal,R.drawable.kasam,R.drawable.tiger,R.drawable.davdas)),
            Movie("Tamil", listOf(R.drawable.alltime,R.drawable.cobra,R.drawable.fir,R.drawable.poster,R.drawable.varisu)),
            Movie("Punjabi", listOf(R.drawable.babe,R.drawable.darra,R.drawable.posti,R.drawable.sadaa,R.drawable.shandhu)),
            Movie("Bhojpuri", listOf(R.drawable.dibar,R.drawable.first_b,R.drawable.loha,R.drawable.patna,R.drawable.shiva_b)),
            Movie("English", listOf(R.drawable.thor,R.drawable.wolb,R.drawable.lala,R.drawable.noah,R.drawable.poc)),
            Movie("Hindi", listOf(R.drawable.bhoot,R.drawable.ghayal,R.drawable.kasam,R.drawable.tiger,R.drawable.davdas)),
            Movie("Tamil", listOf(R.drawable.alltime,R.drawable.cobra,R.drawable.fir,R.drawable.poster,R.drawable.varisu)),
            Movie("Punjabi", listOf(R.drawable.babe,R.drawable.darra,R.drawable.posti,R.drawable.sadaa,R.drawable.shandhu)),
            Movie("Bhojpuri", listOf(R.drawable.dibar,R.drawable.first_b,R.drawable.loha,R.drawable.patna,R.drawable.shiva_b)),

        )

        val verticalAdapter = VerticalMovieAdapter(movies)
        verticalRecyclerView.adapter = verticalAdapter
    }
}
