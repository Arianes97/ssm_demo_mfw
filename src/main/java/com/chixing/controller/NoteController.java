package com.chixing.controller;

import com.chixing.entity.Note;
import com.chixing.common.JsonResult;
import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;
import com.chixing.service.NoteService;
import com.chixing.service.impl.CustomerServiceImpl;
import com.chixing.service.impl.NoteServiceImpl;
import com.chixing.util.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.*;

@RequestMapping("/note")
@Controller
public class NoteController {

    @Autowired
    NoteService noteService = new NoteServiceImpl();
    @Autowired
    CustomerService customerService = new CustomerServiceImpl();

    @RequestMapping("gotoAdd")
    public String gotoAdd(){
        System.out.println("NoteController --> gotoAdd");
        return "note/add";
    }

    @RequestMapping("gotoDetail")
    public String gotoDetail(){
        System.out.println("NoteController --> gotoDetail");
        return "note/detail";
    }
    @RequestMapping("gotoDescription/{noteId}")
    public String gotoDescription(@PathVariable("noteId") int noteId){
        System.out.println("NoteController --> gotoDescription     "   + noteId);
        return "note/description.html?noteId="+ noteId;
    }

    @RequestMapping("gotoMyList")
    public String gotoMyList(){
        System.out.println("NoteController --> gotoMyList");
        return "note/mylist";
    }

    @RequestMapping("add")
    @ResponseBody
    public JsonResult add(Note note,HttpServletRequest request){
        System.out.println("NoteController --> add");
        System.out.println("NoteController --> add  note-->"+note);
        note.setCustId((Integer) request.getSession().getAttribute("customerId"));
        note.setNoteCreateTime(new Date());
/*
        Note testnote = new Note();
        testnote.setCustId((Integer) request.getSession().getAttribute("customerId"));
        testnote.setNoteTitle("测试");
        testnote.setNoteContent("测试游记添加");
        System.out.println("NoteController --> add  testnote-->"+testnote);*/

        Boolean flag = noteService.save(note);
        System.out.println("NoteController --> add  结果"+flag);

        if (flag) return JsonResult.createSuccessJsonResult(null);
        else {
            Map<String,Object> data = new HashMap<>();
            data.put("reason","添加失败");
            return JsonResult.createFailJsonResult(data);
        }
    }

    @RequestMapping("getLatestNote")
    @ResponseBody
    public JsonResult getLatestNote(HttpServletRequest request){
        System.out.println("NoteController --> getLatestNote");
        HttpSession session = request.getSession();
        int id = (int) session.getAttribute("customerId");
        System.out.println("NoteController --> getLatestNote  用户id"+id);
        List<Note> noteList = noteService.getLatestNote(id);

        if (noteList != null || noteList.size() != 0){
            Map<String,Object> data = new HashMap<>();
            data.put("latestNote",noteList.get(0));
            return JsonResult.createSuccessJsonResult(data);
        }else return JsonResult.createFailJsonResult(null);
    }

    @RequestMapping("uploadImg")
    @ResponseBody
    public JsonResult uploadHeadImg(HttpServletRequest request,MultipartFile myfile){
        System.out.println("NoteController --> uploadHeadImg");

        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        File file = new File(path);
        if ( !file.exists()) file.mkdir();

        String fileName = myfile.getOriginalFilename();
        String uuid = UUID.randomUUID().toString();
        fileName = uuid + "_"+ fileName;

        try {
            File uploadfile = new File(file,fileName);
            myfile.transferTo(uploadfile);
            Map<String,Object> datd = new HashMap<>();
            datd.put("filePath",fileName);
            System.out.println(fileName);
            return JsonResult.createSuccessJsonResult(datd);
        } catch (IOException e) {
            e.printStackTrace();
            return JsonResult.createFailJsonResult(null);
        }
    }

    @RequestMapping("getall/{pageNum}")
    @ResponseBody
    public JsonResult getByPage(@PathVariable("pageNum")int pageNum){

        List<Note>  noteList   = noteService.getAllByPage(pageNum);
        int totalCount = this.noteService.getAll();//游记总记录数
        int totalPage =  (int)  Math.ceil(totalCount% PageHelperUtil.pageSize==0?totalCount/ PageHelperUtil.pageSize:totalCount/ PageHelperUtil.pageSize+1);//共几页

        for (Note note:noteList){
            Customer customer = this.customerService.getById(note.getCustId());
            note.setOthers1(customer.getCustName());
        }
        Map<String,Object> data = new HashMap<>();
        data.put("noteList",noteList);
        data.put("totalCount",totalCount);
        data.put("totalPage",totalPage);
        return JsonResult.createSuccessJsonResult(data);
    }

    @RequestMapping("myNoteList")
    @ResponseBody
    public  JsonResult myNoteList(HttpServletRequest request){
        int custId =(int)  request.getSession().getAttribute("customerId");
        List<Note> myNoteList =   this.noteService.getAllByCust(custId);
        Map<String,Object> data = new HashMap<>();
        if(myNoteList != null && myNoteList.size() != 0){
            Customer customer =this.customerService.getById(custId);
            System.out.println(customer);
            //数据中再绑定 customer  (昵称，城市，手机，...)
            data.put("myNoteList",myNoteList);
            data.put("customer",customer);
            return   JsonResult.createSuccessJsonResult(data);
        }else{
            data.put("reason","您暂无写游记");
            return   JsonResult.createFailJsonResult(data);
        }
    }

    /*按Id查询游记*/
    @RequestMapping("getById/{noteId}")
    @ResponseBody
    public JsonResult getById(@PathVariable("noteId") int noteId){
        Note note = noteService.getById(noteId);
        Map<String,Object> data = new HashMap<>();
        data.put("note",note);
        return JsonResult.createSuccessJsonResult(data);
    }









}
