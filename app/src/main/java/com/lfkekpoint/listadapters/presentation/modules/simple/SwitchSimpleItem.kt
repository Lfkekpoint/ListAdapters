package com.lfkekpoint.listadapters.presentation.modules.simple

import com.lfkekpoint.listadapters.R
import com.lfkekpoint.listadapters.presentation.base.list.IBaseListItem

class SwitchSimpleItem(
        val id: Int,
        val title: String,
        val actionOnReceive: (itemId: Int, userChoice: Boolean) -> Unit
) : IBaseListItem {
    override val layoutId = R.layout.item_switch_simple
}