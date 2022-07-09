package com.example.memorynotes.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.memorynotes.R

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val addNote = view.findViewById<ListView>(R.id.addNote)
        addNote.setOnClickListener { goToNoteDetails(0, view) }
    }

    private fun goToNoteDetails(id: Long = 0L, view: View) {
        val action: NavDirections = ListFragmentDirections.actionGoToNote(id)
        val notesListView = view.findViewById<ListView>(R.id.notesListView)

        Navigation.findNavController(notesListView).navigate(action)
    }
}