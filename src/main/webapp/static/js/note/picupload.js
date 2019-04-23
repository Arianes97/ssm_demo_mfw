
$(document).ready(function () {
    $("#myfile").change(function () {
        alert("upload  -->js !!!");
        var exname = $("#myfile").val().split("\\")[2];
        if (exname.indexOf("png") != -1 || exname.indexOf("jpg") != -1 || exname.indexOf("gif") != -1 || exname.indexOf("svg") != -1 || exname.indexOf("jpeg") != -1) {
            $(".setNoteHeaderImgForm").ajaxSubmit({
                type:"post",
                url:"/ssm_demo/note/uploadImg",
                dataType:"json",
                success:function (result) {
                    var  url = "url(/ssm_demo/upload/" + result.data.filePath+")";
                    console.log("picupload js  url:-->"+ url);
                    alert(url);
                    $(".set-note-bg").css("backgroundImage",url);
                    $(".setNoteHeaderImgForm").hide();
                    $(".setNoteHeaderImgTip").hide();

                    $("#headImgPath").val(url);
                }
            })
        }else alert("文件必须为图片！");
    });
});


