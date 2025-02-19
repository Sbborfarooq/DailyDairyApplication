package com.example.dailydairyapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dailydairyapplication.classes.Folder
import com.example.dailydairyapplication.databinding.ItemFolderBinding

class FolderAdapter(
    private val folderList: List<Folder>,
    private val onDeleteClick: (Folder) -> Unit
) : RecyclerView.Adapter<FolderAdapter.FolderViewHolder>() {

    // FolderViewHolder with View Binding
    class FolderViewHolder(private val binding: ItemFolderBinding) :
        RecyclerView.ViewHolder(binding.root) {

        // Bind the data to the views
        fun bind(folder: Folder, onDeleteClick: (Folder) -> Unit) {
            binding.folderNameText.text = folder.name
            binding.folderImg.setImageResource(folder.iconResID)

            binding.deleteFolderButton.setOnClickListener {
                onDeleteClick(folder)
            }
        }
    }

    // 1. Inflate the binding in onCreateViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FolderViewHolder {
        val binding = ItemFolderBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return FolderViewHolder(binding)
    }

    // 2. Bind data to the ViewHolder in onBindViewHolder
    override fun onBindViewHolder(holder: FolderViewHolder, position: Int) {
        val folder = folderList[position]
        holder.bind(folder, onDeleteClick)
    }

    // 3. Return the item count
    override fun getItemCount(): Int = folderList.size
}
