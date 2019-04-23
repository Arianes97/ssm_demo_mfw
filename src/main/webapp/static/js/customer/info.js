
/* 手机号--- session*/
/* {
      "status": "SUCCESS",
          "data": {
              "customerTelno":"18493489349";
           },
      "message": "操作成功"
  }
  */

//html页面加载完毕才执行
$(document).ready(function () {
    getLoginCustomerTelno();
})

//1. 从session中获得登陆用户手机号
function getLoginCustomerTelno(){
    $.get("/ssm_demo/customer/getLoginTelno", {}, function (result) {
        var telno =  result .data.customerTelno;
        console.log("telno:" + telno);
        getCustomerInfo(telno);
    } );
}

/*  2. 根据手机号查询用户信息*/
function  getCustomerInfo(tel) {
    console.log("getCustomerInfo telno:" + tel);
    $.get("/ssm_demo/customer/info", {telno: tel}, function (result) {
        var customer = result.data.customer;
        console.log("cust id =" + customer.custId);
        console.log("custName =" + customer.custName);
        console.log("custTelno =" + customer.custTelno);
          //3. 渲染用户数据
        console.log("customer =" + customer);
        $("input[name=custName]").val(customer.custName);
        $("input[name=custCity]").val(customer.custCity);
        $("input[name=custBirth]").val(customer.custBirth);
        $("input[name=others1]").val(customer.others1);

        console.log("customer gender:"+customer.custGender);

        if( customer.custGender =='M'){
            console.log("页面也默认为男性");
            //已知页面默认设置为男性
        }else{
            $("input[value=M]").removeAttr("checked");
            $("input[value=F]").attr("checked","checked");
        }
    });
}

