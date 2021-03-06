package com.example.appnotes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FragmentNotes extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notes, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NotesRepository notesRepository = new NotesRepository();

        LinearLayout notesList = view.findViewById(R.id.notes_list_container);

        Button btn = view.findViewById(R.id.button);
        EditText editText = view.findViewById(R.id.newNoteText);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               String text = editText.getText().toString();
               View itemView = LayoutInflater.from(requireContext()).inflate(R.layout.item_note, notesList, false);
               TextView noteText = itemView.findViewById(R.id.note_resource);
               noteText.setText(text);
               notesList.addView(itemView);
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}