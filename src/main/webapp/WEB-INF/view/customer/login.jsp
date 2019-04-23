<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>手机登录</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

    <link rel="stylesheet" href="../../../dist/css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css" />
    <script type="text/javascript" src="../../../dist/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="../../../dist/js/bootstrap.min.js"></script>
    <style type="text/css">
        #login {
            width: 450px;
            height: 100px;
            margin: 126px auto;
        }

        #btn {
            margin-left: 100px;
            margin-top: -25px;
            width: 120px;
            height: 25px;
            font-size: 11px;
        }

        body {
            background-color: #ecfcf9;
        }
    </style>
</head>
<script type="text/javascript">
    var InterValObj; //timer变量，控制时间
    var count = 60; //间隔函数，1秒执行
    var curCount;//当前剩余秒数
    function sendMessage() {
        curCount = count;
        $("#btn").attr("disabled", "true");//发送验证码
        $("#btn").val(curCount + "秒后可重新发送");
        InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次请求后台发送验证码 TODO
    }
    //timer处理函数
    function SetRemainTime() {
        if (curCount == 0) {
            window.clearInterval(InterValObj);//停止计时器
            $("#btn").removeAttr("disabled");//启用按钮
            $("#btn").val("重新发送验证码");
        } else {
            curCount--;
            $("#btn").val(curCount + "秒后可重新发送");
        }
    }
</script>
<body>
<div class="container">
    <div id="login">
        <fieldset>
            <div id="legend" class="">
                <legend class="">用户登录</legend>
            </div>
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="col-sm-2 control-label">手机号</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="phone" name="phone"
                               placeholder="请输入您的手机号" required>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">验证码</label>
                    <div class="col-sm-3">
                        <input type="code" class="form-control" id="code" name="code"
                               placeholder="验证码" required> <input
                            class="btn btn-default" id="btn" name="btn" value="发送验证码"
                            onclick="sendMessage()" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="button" class="btn btn-success" id="lo">手机号登录</button>

                    </div>
                </div>
            </form>
        </fieldset>
    </div>
</div>
</body>
<script type="text/javascript">
    var sms = "";
    //发送验证码
    $("#btn").click(function() {
        var phone = $("#phone").val();
        if (phone != "") {
            $.ajax({
                url : "sendSMS",  //发送请求  目标地址
                type : "post",  //POST方式传输
                data : {  //发送到服务器的数据
                    "phone" : phone
                },
                success : function(result) {
                    sms = result;
                }
            });
        } else {
            alert("请输入手机号");
            return false;
        }
    });
    //点击登录
    $("#lo").click(function() {
        var code = $("#code").val();
        if (code == "") {
            alert("请输入验证码");
        } else {
            if (sms == code) {
                window.location.href = "success.jsp";
            } else {
                alert("验证码错误");
            }
            ;
        }
        ;
    });
</script>
</html>


