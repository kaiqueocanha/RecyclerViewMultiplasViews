package com.ocanha.recyclerviewcommultiplasviews

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.ocanha.recyclerviewcommultiplasviews.databinding.ResAtorBinding
import com.ocanha.recyclerviewcommultiplasviews.databinding.ResCabecalhoBinding

sealed class MainRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class CabecalhoViewHolder(
        private val binding: ResCabecalhoBinding
    ) : MainRecyclerViewHolder(binding) {

        fun bind(cabecalho: MainRecyclerViewItem.Cabecalho) {
            binding.imgHeader.setImageResource(cabecalho.image)
        }

    }

    class AtorViewHolder(
        private val binding: ResAtorBinding
    ) : MainRecyclerViewHolder(binding) {

        fun bind(ator: MainRecyclerViewItem.Ator) {
            binding.tvAtor.text = ator.nome
            binding.tvAtorPapel.text = ator.papel
            binding.imgAtor.setImageResource(ator.image)
        }

    }

}
