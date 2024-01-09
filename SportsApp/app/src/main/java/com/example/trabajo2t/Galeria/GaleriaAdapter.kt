package com.example.trabajo2t.Galeria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.trabajo2t.databinding.HolderGaleriaBinding

class GaleriaAdapter() : Adapter<GaleriaAdapter.CeldaGaleria>() {

    val listaGaleria = ArrayList<Int>()

    inner class CeldaGaleria(val binding: HolderGaleriaBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CeldaGaleria {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HolderGaleriaBinding.inflate(inflater, parent, false)
        val celda = CeldaGaleria(binding)
        return celda
    }

    override fun getItemCount(): Int {
        return listaGaleria.size
    }

    override fun onBindViewHolder(holder: CeldaGaleria, position: Int) {
        val imagen = listaGaleria[position]
        holder.binding.imageGaleria.setImageResource(imagen)
    }

    fun llenarLista(lista: List<Int>) {
        listaGaleria.addAll(lista)
        notifyDataSetChanged()
    }
}