package com.lfkekpoint.listadapters.presentation.modules.simple

import com.lfkekpoint.listadapters.R
import com.lfkekpoint.listadapters.presentation.base.list.IBaseListItem

class InfoSimpleItem(val title: String, val value: String) : IBaseListItem {
    override val layoutId = R.layout.item_info_simple
}