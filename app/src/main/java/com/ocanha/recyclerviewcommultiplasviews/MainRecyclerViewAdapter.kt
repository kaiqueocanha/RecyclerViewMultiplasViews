package com.ocanha.recyclerviewcommultiplasviews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ocanha.recyclerviewcommultiplasviews.databinding.ResAtorBinding
import com.ocanha.recyclerviewcommultiplasviews.databinding.ResCabecalhoBinding
import java.lang.IllegalArgumentException

class MainRecyclerViewAdapter : RecyclerView.Adapter<MainRecyclerViewHolder>() {

    private var lista = listOf<MainRecyclerViewItem>()

    fun setData(listaToSet: MutableList<MainRecyclerViewItem>) {
        this.lista = listaToSet
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder =
        when (viewType) {
            TIPO_ATOR -> MainRecyclerViewHolder.AtorViewHolder(
                ResAtorBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            TIPO_CABECALHO -> MainRecyclerViewHolder.CabecalhoViewHolder(
                ResCabecalhoBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw IllegalArgumentException("Tipo de View Inválido")
        }


    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) {
        when (holder) {
            is MainRecyclerViewHolder.AtorViewHolder -> holder.bind(lista[position] as MainRecyclerViewItem.Ator)
            is MainRecyclerViewHolder.CabecalhoViewHolder -> holder.bind(lista[position] as MainRecyclerViewItem.Cabecalho)
        }
    }

    override fun getItemViewType(position: Int): Int = when (lista[position]) {
        is MainRecyclerViewItem.Ator -> TIPO_ATOR
        is MainRecyclerViewItem.Cabecalho -> TIPO_CABECALHO
    }


    override fun getItemCount(): Int = lista.size

    companion object {
        const val TIPO_CABECALHO = 0
        const val TIPO_ATOR = 1
    }
}