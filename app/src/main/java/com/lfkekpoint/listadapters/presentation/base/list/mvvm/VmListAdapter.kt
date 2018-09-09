package com.lfkekpoint.listadapters.presentation.base.list.mvvm

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.lfkekpoint.listadapters.presentation.base.list.IBaseListAdapter

class VmListAdapter : RecyclerView.Adapter<VmViewHolder>(), IBaseListAdapter<IBaseItemVm> {

    private var mItems = ArrayList<IBaseItemVm>()

    override fun getItemCount() = mItems.size
    override fun getItemViewType(position: Int) = mItems[position].layoutId

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VmViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val viewDataBinding = DataBindingUtil.inflate<ViewDataBinding>(inflater!!, viewType, parent, false)

        return VmViewHolder(viewDataBinding)

    }

    override fun onBindViewHolder(holder: VmViewHolder, position: Int) {

        holder.binding.setVariable(mItems[position].brVariableId, mItems[position])
        holder.binding.executePendingBindings()
    }

    override fun add(newItem: IBaseItemVm) {

        mItems.add(newItem)
        notifyItemInserted(mItems.lastIndex)
    }

    override fun add(newItems: ArrayList<IBaseItemVm>?) {

        val oldSize = mItems.size
        mItems.addAll(newItems!!)
        notifyItemRangeInserted(oldSize, newItems.size)
    }

    override fun clearAll() {
        mItems.clear()
        notifyDataSetChanged()
    }

    override fun getItemId(position: Int): Long {

        val pos = mItems.size - position
        return super.getItemId(pos)
    }

    override fun addAtPosition(pos: Int, newItem: IBaseItemVm) {

        mItems.add(pos, newItem)
        notifyItemInserted(pos)
    }

    override fun remove(position: Int) {

        mItems.removeAt(position)
        notifyItemRemoved(position)
    }
}