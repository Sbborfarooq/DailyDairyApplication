package com.example.dailydairyapplication.views

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dailydairyapplication.classes.Folder
import com.example.dailydairyapplication.adapters.FolderAdapter
import com.example.dailydairyapplication.databinding.FolderDialogueCreateBinding
import com.example.dailydairyapplication.databinding.FragmentFoldersBinding


class FoldersFragment : Fragment() {

    private var _binding: FragmentFoldersBinding? = null
    private val binding get() = _binding!!

    private lateinit var folderAdapter: FolderAdapter
    private val folderList = mutableListOf<Folder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFoldersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.folderBackArrow.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        folderAdapter = FolderAdapter(folderList) { folderToDelete ->
            deleteFolder(folderToDelete)
        }
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = folderAdapter

        binding.floatingActionButton.setOnClickListener {
            showCreateFolderDialogue()
        }
        loadFolders()
    }

    private fun showCreateFolderDialogue() {
        val dialogBinding = FolderDialogueCreateBinding.inflate(layoutInflater)
        val dialog = android.app.Dialog(requireContext())
        dialog.setContentView(dialogBinding.root)
        dialog.setCanceledOnTouchOutside(false)


        dialogBinding.createButton.setOnClickListener {
            val folderName = dialogBinding.editTextText.text.toString()
            if (folderName.isNotEmpty()) {
                addFolder(folderName)
                dialog.dismiss()
            } else {

                Toast.makeText(requireContext(), "Folder nane cannot be empty", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        dialogBinding.button3.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()

    }

    private fun addFolder(folderName: String) {
        val newFolder = Folder(folderName)
        folderList.add(newFolder)
        folderAdapter.notifyItemInserted(folderList.size - 1)
        saveFolders()
    }

    private fun deleteFolder(folder: Folder) {
        val position = folderList.indexOf(folder)

        if (position != -1) {
            folderList.removeAt(position)
            folderAdapter.notifyItemRemoved(position)
            saveFolders()
        }
    }

    private fun saveFolders() {
        val sharedPreferences =
            requireContext().getSharedPreferences("folders_prefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val folderNames = folderList.map { it.name }.toSet()
        editor.putStringSet("folder_names", folderNames)
        editor.apply()
    }

    private fun loadFolders() {
        val sharedPreferences =
            requireContext().getSharedPreferences("folders_prefs", Context.MODE_PRIVATE)
        val folderNames = sharedPreferences.getStringSet(
            "folder_names", emptySet()
        ) ?: emptySet()
        folderList.clear()
        folderList.addAll(folderNames.map { Folder(it) })
        folderAdapter.notifyDataSetChanged()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

        
