package com.chixing.dao;

import com.chixing.entity.Note;
import com.chixing.entity.NoteExample;
import com.chixing.entity.CustomerExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * NoteDao继承基类
 */
@Repository
public interface NoteDao extends MyBatisBaseDao<Note, Integer, NoteExample> {

    public List<Note> selectLatestOneByCustId(int custId);

    public List<Note> selectByExample(CustomerExample customerExample);

    public int getCount();

    public int insert(Note note);

}