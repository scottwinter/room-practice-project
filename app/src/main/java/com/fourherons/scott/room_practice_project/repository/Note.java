package com.fourherons.scott.room_practice_project.repository;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {

    @PrimaryKey
    public int noteId;

    public String noteTitle;

    public String noteBody;
}
