$(".myfile").change(function () {

    var exname = $(".myfile").val().split("\\")[2];
    console.log("exname:"+exname);

    if (exname.indexOf("png") != -1 || exname.indexOf("jpg") != -1 || exname.indexOf("gif") != -1 || exname.indexOf("bmp") != -1 || exname.indexOf("jpeg") != -1) {
        $.ajaxFileUpload(
            {
                url: '../note/uploadImg',
                method:'post',
                secureuri: true,
                fileElementId: 'myfile',
                processData:false,
                contentType:false,
                success: function (data) {  // xhr.readyState ==4 && xhr.status ==200
                    var url = "url(../upload/"+exname+")";
                    console.log("url:"+url);
                    $(".set-note-bg").css("backgroundImage",url);

                    $(".setNoteHeaderImgForm").hide();
                    $(".setNoteHeaderImgTip").hide();


                    $("#headImgPath").val("../upload/"+exname);

                  /*  var ele = " <img src=\"\" id='pic' />";
                    $("#pre_img").append(ele);
                    $("#pic").attr("src", "upload/"+exname);*/
                },
                error: function (data) {
                    alert("error");
                }
            }
        )
    } else {
        alert("必须是图片！");
    }

    $("#headImgForm").ajaxSubmit({
        type:"POST",
        url:"/ssm_demo/note/headImgUpload" ,
        dataType:"json",
        success:function(result){

            var filePath = result.data.filePath;
            console.log("file upload result:"+JSON.stringify(filePath));
            var imgUrl = "url(/ssm_demo/"+filePath+")";
            console.log("imgUrl:"+imgUrl);
            $(".set-note-bg").css("backgroundImage",imgUrl);
            console.log("okokok...");
            $(".setNoteHeaderImgForm").hide();
            $(".setNoteHeaderImgTip").hide();
            $("#headImgPath").val(imgUrl);
        }
    });


});