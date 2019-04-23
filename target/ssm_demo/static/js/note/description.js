//加载我的最近的游记详情
var url = window.location.href;
var noteID = url.split('/')[url.split('/').length-1];
alert("url ="+url);
alert("noteId ="+noteID);
$.get("/ssm_demo/note/getById/"+noteID, {}, function (result) {
    var note = result.data.note;

    console.log("note.noteHeadImg:"+note.noteHeadImg);
    console.log("note.noteCreateTime:"+note.noteCreateTime);
    console.log("note.noteCity:"+note.noteCity);
    console.log("note.noteTitle:"+note.noteTitle);
    console.log("note.noteContent:"+note.noteContent);

    /*$(".set-note-bg").css("backgroundImage","url('/ssm_demo/images/bangkok.jpg')");*/
    $(".set-note-bg").css("backgroundImage",note.noteHeadImg);

    $(".note_title").html(note.noteTitle );


    $(".noteTripDate").html(new Date(note.noteTripDate).format("Y-m-d")  );  //日期获得的是毫秒数，所以要转换成日期格式显示在页面中
    $(".noteTripDays").html(note.noteTripDays  );
    $(".noteTripPartner").html(note.noteTripPartner  );
    $(".noteTripFeePerPeople").html(note.noteTripFeePerPeople  );

    $(".note_content").html(note.noteContent );
} );
