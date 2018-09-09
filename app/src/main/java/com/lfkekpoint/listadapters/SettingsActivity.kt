package com.lfkekpoint.listadapters

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.lfkekpoint.listadapters.presentation.modules.simple.InfoSimpleItem
import com.lfkekpoint.listadapters.presentation.modules.simple.SettingsListAdapter
import com.lfkekpoint.listadapters.presentation.modules.simple.SwitchSimpleItem
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)


        val adapter = SettingsListAdapter()

        rView.layoutManager = LinearLayoutManager(this)
        rView.adapter = adapter

        adapter.add(InfoSimpleItem("User Name", "Leo Allford"))
        adapter.add(InfoSimpleItem("Balance", "350 $"))
        adapter.add(InfoSimpleItem("Tariff", "Business"))
        adapter.add(SwitchSimpleItem(1, "Send Notifications") { itemId, userChoice -> onCheck(itemId, userChoice) })
        adapter.add(SwitchSimpleItem(2, "Send News on Email") { itemId, userChoice -> onCheck(itemId, userChoice) })
    }

    private fun onCheck(itemId: Int, userChoice: Boolean) {
        when (itemId) {
            1 -> Toast.makeText(this, "Notification now set as $userChoice", Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(this, "Send news now set as $userChoice", Toast.LENGTH_SHORT).show()
        }
    }}
