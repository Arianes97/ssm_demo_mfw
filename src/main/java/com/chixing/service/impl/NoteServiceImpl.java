package com.chixing.service.impl;

import com.chixing.entity.Note;
import com.chixing.entity.NoteExample;
import com.chixing.dao.NoteDao;
import com.chixing.entity.CustomerExample;
import com.chixing.service.NoteService;
import com.chixing.util.PageHelperUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteDao dao;

    @Override
    public Boolean save(Note note) {
        int rows = dao.insert(note);
        return rows>0;
    }

    @Override
    public List<Note> getLatestNote(int custId) {
       List<Note> noteList = dao.selectLatestOneByCustId(custId);
/*        Note testnote = new Note();
        testnote.setCustId(custId);
        testnote.setNoteTitle("测试");
        testnote.setNoteContent("测试游记添加");

        List<Note> noteList = new ArrayList<>();
        noteList.add(testnote);*/

        if (noteList != null ||noteList.size() != 0){
            return noteList;
        }else return null;
    }


            
    @Override
    public List<Note> getAllByPage(int pageNum) {
        PageHelper.startPage(pageNum,PageHelperUtil.pageSize); //PageHelper 拦截所有的select 操作，分页
       CustomerExample customerExample = null;
  /*       customerExample.setOffset((long) ((pageNum-1)*PageHelperUtil.pageSize));
        customerExample.setLimit(PageHelperUtil.pageSize);*/
        List<Note>  noteList  = dao.selectByExample(customerExample);// 只有当前的3条记录
        System.out.println("NoteServiceImpl-->getAllByPage，第"+pageNum+"页记录：");
        for (Note n: noteList) {
            System.out.println("        "+n);
        }
        return noteList;
    }

    @Override
    public List<Note> getAllByCust(int custId) {
        NoteExample example =   new NoteExample();
        example. createCriteria().andCustIdEqualTo(custId);
        List<Note> noteList = dao.selectByExample(example);
        if(noteList != null || noteList.size() != 0) return noteList;
        else return null;
    }

    @Override
    public int getAll() {
        int count = dao.getCount();
        return count;
    }

    @Override
    public Note getById(int noteId) {
        Note note = dao.selectByPrimaryKey(noteId);
        return note;
    }
}
