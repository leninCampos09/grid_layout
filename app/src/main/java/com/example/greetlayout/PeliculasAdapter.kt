package com.example.greetlayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PeliculasAdapter(private val peliculasLista: List<Peliculas>):RecyclerView.Adapter<peliculasViewHolder>() { override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): peliculasViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_peliculas, parent, false)
    return peliculasViewHolder(view)
    }

    override fun onBindViewHolder(holder: peliculasViewHolder, position: Int) {
     holder.bind(peliculasLista[position])
    }

    override fun getItemCount(): Int {
        return peliculasLista.size
    }
}