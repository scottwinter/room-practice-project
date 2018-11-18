package com.fourherons.scott.room_practice_project.repository;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface  NoteDao {

    @Query("SELECT * FROM notes")
    List<Note> getAllNotes();

    @Query("SELECT * FROM notes WHERE noteId = noteId")
    Note getNoteById(int noteId);

    @Insert
    void insertAll(Note... notes);

    @Insert
    void insertNote(Note note);

    @Update
    Note updateNote(Note note);

    @Delete
    void delete(Note note);
}
