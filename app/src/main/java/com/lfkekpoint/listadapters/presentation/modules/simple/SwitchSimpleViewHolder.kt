package com.lfkekpoint.listadapters.presentation.modules.simple

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_switch_simple.view.*

class SwitchSimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvTitle = view.tv_switch_title
    val tvValue = view.tv_switch_value
}