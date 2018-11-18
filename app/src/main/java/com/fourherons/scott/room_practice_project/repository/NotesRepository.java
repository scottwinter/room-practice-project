package com.fourherons.scott.room_practice_project.repository;

import android.app.Application;

import java.util.List;

public class NotesRepository {

    private NoteDao noteDao;

    private List<Note> allNotes;

    public NotesRepository(Application application) {
        NoteDatabase db = NoteDatabase.getDatabase(application.getApplicationContext());
        noteDao = db.noteDao();
        allNotes = noteDao.getAllNotes();
    }
}
