package com.chixing.service;

import com.chixing.entity.Note;
import java.util.List;

public interface NoteService {

    public Boolean save(Note note);

    public List<Note> getLatestNote(int custId);

    public List<Note> getAllByPage(int pageNum);

    public List<Note> getAllByCust(int custId);

    public int getAll();

    public  Note getById(int noteId);


}
