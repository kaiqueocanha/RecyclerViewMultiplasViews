package com.ocanha.recyclerviewcommultiplasviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ocanha.recyclerviewcommultiplasviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val mainRecyclerViewAdapter = MainRecyclerViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.rvMain.setHasFixedSize(true)
        _binding.rvMain.layoutManager = LinearLayoutManager(this@MainActivity)
        _binding.rvMain.adapter = mainRecyclerViewAdapter

        mainRecyclerViewAdapter.setData(getData())

    }

    private fun getData(): MutableList<MainRecyclerViewItem> {
        val lista = mutableListOf<MainRecyclerViewItem>()
        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 1",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 2",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 3",
                "Obiwan-Kenobi"
            )
        )
        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 4",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 5",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 6",
                "Obiwan-Kenobi"
            )
        )
        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 4",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 5",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 6",
                "Obiwan-Kenobi"
            )
        )
        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 4",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 5",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 6",
                "Obiwan-Kenobi"
            )
        )
        lista.add(MainRecyclerViewItem.Cabecalho(R.drawable.header))
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 4",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 5",
                "Obiwan-Kenobi"
            )
        )
        lista.add(
            MainRecyclerViewItem.Ator(
                R.drawable.img,
                "Ewan McGregor 6",
                "Obiwan-Kenobi"
            )
        )
        return lista
    }
}