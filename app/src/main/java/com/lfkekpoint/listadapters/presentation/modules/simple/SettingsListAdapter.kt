package com.lfkekpoint.listadapters.presentation.modules.simple

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.lfkekpoint.listadapters.R
import com.lfkekpoint.listadapters.presentation.base.list.simple.SimpleListAdapter

class SettingsListAdapter : SimpleListAdapter() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val context = parent.context

        return when (viewType) {

            R.layout.item_info_simple -> InfoSimpleViewHolder(inflateByViewType(context, viewType, parent))
            R.layout.item_switch_simple -> SwitchSimpleViewHolder(inflateByViewType(context, viewType, parent))

            else -> throw IllegalStateException("There is no match with current layoutId")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {

            is InfoSimpleViewHolder -> {
                val infoItem = items[position] as InfoSimpleItem

                holder.tvTitle.text = infoItem.title
                holder.tvValue.text = infoItem.value
            }

            is SwitchSimpleViewHolder -> {
                val switchItem = items[position] as SwitchSimpleItem

                holder.tvTitle.text = switchItem.title
                holder.tvValue.setOnCheckedChangeListener { _, isChecked ->
                    switchItem.actionOnReceive.invoke(switchItem.id, isChecked)
                }
            }

            else -> throw IllegalStateException("There is no match with current holder instance")
        }
    }
}