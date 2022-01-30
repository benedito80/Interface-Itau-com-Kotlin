package br.com.livedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private val adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemsLista()
    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItemsLista() {
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "Cartões"
                ),
                MenuItemModel(
                    "Meus comprovantes"
                ),
                MenuItemModel(
                    "Investimentos"
                ),
                MenuItemModel(
                    "Portabilidade de salário"
                ),
                MenuItemModel(
                    "Crédito"
                ),
                MenuItemModel(
                    "Seguros"
                ),
                MenuItemModel(
                    "Dolar"
                ),
                MenuItemModel(
                    "Transferencias"
                )
            )
        )
    }
}