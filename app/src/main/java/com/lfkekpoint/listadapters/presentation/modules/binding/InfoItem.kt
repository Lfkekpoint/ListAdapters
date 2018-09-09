package com.lfkekpoint.listadapters.presentation.modules.binding

import com.lfkekpoint.listadapters.R
import com.lfkekpoint.listadapters.BR
import com.lfkekpoint.listadapters.presentation.base.list.mvvm.IBaseItemVm

class InfoItem(val title: String, val value: String) : IBaseItemVm {

    override val brVariableId = BR.vmInfo
    override val layoutId = R.layout.item_info
}