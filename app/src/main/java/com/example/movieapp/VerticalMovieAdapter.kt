package com.example.movieapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class VerticalMovieAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<VerticalMovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        private val horizontalRecyclerView: RecyclerView = itemView.findViewById(R.id.horizontalRecyclerView)

        fun bind(movie: Movie) {
            titleTextView.text = movie.title


            val horizontalAdapter = HorizontalMovieAdapter(movie.horizontalMovies)
            horizontalRecyclerView.adapter = horizontalAdapter
            horizontalRecyclerView.layoutManager =
                LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        }
    }
}
