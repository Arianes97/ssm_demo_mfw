//加载我的最近的游记详情
$(document).ready(function(){
    alert("notedetail loading----->");
        $.get("/ssm_demo/note/getLatestNote", {}, function (result) {
            var note = result.data.latestNote;
            console.log("note.noteHeadImg:"+note.noteHeadImg);
            console.log("note.noteTripDate:"+note.noteTripDate);
            console.log("note.noteTripDays:"+note.noteTripDays);
            console.log("note.noteTitle:"+note.noteTitle);
            console.log("note.noteContent:"+note.noteContent);

            $(".set-note-bg").css("backgroundImage",note.noteHeadImg);

            $(".note_title").html(note.noteTitle );


            $(".noteTripDate").html(new Date(note.noteTripDate).format("Y-m-d")  );  //日期获得的是毫秒数，所以要转换成日期格式显示在页面中
            $(".noteTripDays").html(note.noteTripDays  );
            $(".noteTripPartner").html(note.noteTripPartner  );
            $(".noteTripFeePerPeople").html(note.noteTripFeePerPeople  );

            $(".note_content").html(note.noteContent );

        } );
})
