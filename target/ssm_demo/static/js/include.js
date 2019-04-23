$(function () {
    $.get("/ssm_demo/header.html",function (data) {
        $("#header").html(data);
    });
    $.get("/ssm_demo/footer.html",function (data) {
        $("#footer").html(data);
    });
});