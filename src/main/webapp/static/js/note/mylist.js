//获得我的所有游记
$.get("/ssm_demo/note/myNoteList",{},function (result) {

    var noteList = result.data.myNoteList;
    console.log("noteList...................:"+noteList);
    var customer = result.data.customer;
    console.log("===============customer=============");
    console.log("customer"+ customer.custName);
    console.log("customer"+ customer.custCity);
    $.each(noteList,function(index,item){
        console.log("noteId:"+ item.noteId);
        console.log("custId:"+ item.custId);
        console.log("noteTitle:"+ item.noteTitle);
        console.log("noteTripDate:"+ item.noteTripDate);
        console.log("============noteList================");


        /*========= 数据渲染 =========*/
        var ele = "  <li style=\"list-style: none;float: left;margin-left: 40px;margin-bottom: 40px\">\n" +
            "                                    <a href=\"javascript:;\" >\n" +
            "                                        <div class=\"noteHeadImg\" style=\"width: 400px;height: 150px;border: 1px solid grey;;background-repeat: no-repeat \"></div>\n" +
            "                                        <span class=\"noteTitle\" style=\"font-weight: bold;font-size: 16px;margin-right: 30px;display: block\"></span>\n" +
            "                                        <span class=\"noteCreateTime\" style=\"font-weight: bold;font-size: 16px\"></span>\n" +
            "                                        <span class=\"custName\" style=\"font-weight: bold;font-size: 16px\"></span>\n" +
            "                                        <span  style=\"font-weight: bold;font-size: 16px\">,坐标：</span>\n" +
            "                                        <span class=\"custCity\" style=\"font-weight: bold;font-size: 16px\"></span>\n" +

            "                                    </a>\n" +
            "           </li>";

        $("#mynote_list").append(ele);

        var li = $("#mynote_list").children().eq(index) ; //li
        var a = li.children().eq(0);
        a.attr("name",item.noteId);
        console.log("li:" + li);
        console.log("a:" + a);

        a.children().eq(0).css("backgroundImage",item.noteHeadImg);
        a.children().eq(1).text(item.noteTitle);
        a.children().eq(2).text(  new Date(item.noteCreateTime).format("Y-m-d"));
        a.children().eq(3).text(customer.custName);
        a.children().eq(5).text( customer.custCity);

    });
});

//事件监听
var ul = $("#mynote_list");
console.log("=================ul==============================="+ul);
ul.click (function (event) {
        alert("click: "+event.target);
        var ele = event.target;
        console.log("ele nodename  :"+ele.nodeName);
        if (ele.nodeName == "SPAN" || ele.nodeName == "DIV"){
            var a = ele.parentNode;
            console.log(a);
            var node_Id = a.getAttribute("name");
            alert("click note id: "+ node_Id);
            window.location.href = "/ssm_demo/note/gotoDescription/"+node_Id;
        }
});