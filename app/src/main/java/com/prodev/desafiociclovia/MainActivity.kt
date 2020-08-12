package com.prodev.desafiociclovia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cycloAdapter: CycloAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
        cycloAdapter = CycloAdapter(SetupCiclovias().init() as MutableList<Ciclovia>)
        recyclerView = findViewById(R.id.cyclo_rv)
        recyclerView.adapter = cycloAdapter
        recyclerView.layoutManager = layoutManager
       // recyclerView.setHasFixedSize(true)

        val filter : Button= findViewById(R.id.las_condes_btn)
        val notFilter : Button = findViewById(R.id.sin_filtro_btn)

        filter.setOnClickListener(View.OnClickListener {

        })



    }
}