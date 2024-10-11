package com.example.greetlayout

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class peliculasViewHolder(view:View) : RecyclerView.ViewHolder(view) {

    val nombreTextView: TextView =  view.findViewById(R.id.tvPeliculaNombre)


    fun bind(pelicula: Peliculas){
        nombreTextView.text = pelicula.nombre
    }
}