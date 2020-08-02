package com.illia.mvvm.template.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.illia.mvvm.template.model.dto.GithubItem
import com.illia.template.databinding.LayoutGitBinding


class GithubAdapter(private var items: MutableLiveData<List<GithubItem>>): RecyclerView.Adapter<GithubAdapter.GithubItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: LayoutGitBinding = LayoutGitBinding.inflate(inflater, parent, false)
        return GithubItemViewHolder(binding.root)
    }

    class GithubItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: LayoutGitBinding? = DataBindingUtil.bind(itemView)
    }

    override fun getItemCount(): Int {
        return if (items.value?.size != null) items.value?.size!! else 0
    }

    override fun onBindViewHolder(holder: GithubItemViewHolder, position: Int) {
        holder.binding?.githubItem = items.value?.get(position)
    }

    object DataBindingAdapter {
        @BindingAdapter("populateData")
        @JvmStatic
        fun populateData(recyclerView: RecyclerView?, items: MutableLiveData<List<GithubItem>>) {
            recyclerView?.adapter = GithubAdapter(items)
        }
    }
}