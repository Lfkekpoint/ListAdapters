package com.lfkekpoint.listadapters.presentation.modules.binding

import android.databinding.BindingAdapter
import android.widget.CompoundButton
import android.widget.Switch
import com.lfkekpoint.listadapters.R
import com.lfkekpoint.listadapters.BR
import com.lfkekpoint.listadapters.presentation.base.list.mvvm.IBaseItemVm

class SwitchItem (
        val id: Int,
        val title: String,
        private val actionOnReceive: (itemId: Int, userChoice: Boolean) -> Unit
) : IBaseItemVm {

    override val brVariableId = BR.vmSwitch
    override val layoutId = R.layout.item_switch

    val listener = CompoundButton.OnCheckedChangeListener { _, isChecked ->
        actionOnReceive.invoke(id, isChecked) }
}

@BindingAdapter("switchListener")
fun setSwitchListener(sw: Switch, listener: CompoundButton.OnCheckedChangeListener) {
    sw.setOnCheckedChangeListener(listener)
}