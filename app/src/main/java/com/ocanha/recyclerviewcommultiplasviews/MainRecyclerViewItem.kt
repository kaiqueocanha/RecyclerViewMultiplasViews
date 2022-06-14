package com.ocanha.recyclerviewcommultiplasviews

sealed class MainRecyclerViewItem {

    class Cabecalho(
        val image: Int
    ) : MainRecyclerViewItem()

    class Ator(
        val image: Int,
        val nome: String,
        val papel: String,
    ) : MainRecyclerViewItem()

}
