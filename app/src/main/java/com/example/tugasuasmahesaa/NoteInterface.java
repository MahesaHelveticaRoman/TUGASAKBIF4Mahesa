package com.example.tugasuasmahesaa;
//Mahesa helvetica Roman 10120152 IF-4
import android.database.Cursor;

import com.example.tugasuasmahesaa.model.Note;

public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);

}
