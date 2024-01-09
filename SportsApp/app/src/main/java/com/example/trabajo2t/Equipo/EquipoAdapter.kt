package com.example.trabajo2t.Equipo

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.resources.R
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.trabajo2t.databinding.HolderEquipoBinding
import com.example.trabajo2t.databinding.HolderGaleriaBinding

class EquipoAdapter() : RecyclerView.Adapter<EquipoAdapter.CeldaEquipo>() {

    val listaEquipo = ArrayList<Jugador>()

    inner class CeldaEquipo(val binding: HolderEquipoBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CeldaEquipo {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HolderEquipoBinding.inflate(inflater, parent, false)
        val celda = CeldaEquipo(binding)
        return celda
    }

    override fun getItemCount(): Int {
        return listaEquipo.size
    }

    override fun onBindViewHolder(holder: CeldaEquipo, position: Int) {
        val celdaJugador = listaEquipo[position]
        holder.binding.textView2.text = celdaJugador.apodo
        holder.binding.textView5.text = celdaJugador.posicion
        Glide.with(holder.itemView).load(celdaJugador.foto)
            .placeholder(com.example.trabajo2t.R.drawable.player).into(holder.binding.imageView6)

        holder.itemView.setOnClickListener {
            val bundle = bundleOf(
                "jugador" to celdaJugador
            )
            Navigation.findNavController(holder.itemView)
                .navigate(com.example.trabajo2t.R.id.action_equipo_to_jugadorFragment, bundle)
        }
    }

    fun llenarLista(lista: List<Jugador>) {
        listaEquipo.addAll(lista)
        notifyDataSetChanged()
    }

}