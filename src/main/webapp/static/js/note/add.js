
//提交添加游记
$(".addNoteBtn").click(function () {
    alert("add-->js !!!");
    $.ajax({
        type:"POST",
        url:"/ssm_demo/note/add" ,
        data: $('#noteForm').serialize(),
        success:function(result){
            console.log(result.status);
            if(result.status=="SUCCESS"){
                //添加游记成功后，跳转到我的游记列表
                window.location.href="/ssm_demo/note/gotoDetail"
            }else{
                //添加游记失败
                $("#note_tip").text(result.data.reason);
            }
        }
    });
});