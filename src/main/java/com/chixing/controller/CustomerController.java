package com.chixing.controller;

import com.chixing.common.JsonResult;
import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;
import com.chixing.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService = new CustomerServiceImpl();

/* ========================获取验证码======================== */
    @RequestMapping("getCode")
    @ResponseBody
    public String sendSMS(String phone){
        System.out.println("customerController-->sendSMS");
        //手机验证码
        //  String code = GetMessageCode.getCode(phone);
        String code="123456";
        System.out.println("code:"+code);
        Map<String,Object> data = new HashMap<>();
        data.put("code",code);
        return code;
    }


/* ========================跳转到登录页面======================== */
    @RequestMapping("gotoLogin")
    public String gotoLogin(HttpServletRequest request){
        System.out.println("controller-->gotoLogin");
        return "customer/login";
    }


/* ========================跳转到注册页面======================== */
    @RequestMapping("gotoRegist")
    public String gotoRegist(){
        System.out.println("controller-->gotoRegist");
        return "customer/regist";
    }


/* ========================跳转到个人中心页面======================== */
    @RequestMapping("gotoInfo")
    public String gotoInfo(){
        System.out.println("controller-->gotoInfo");
        return "customer/info";
    }


/* ========================通过电话号码登录======================== */
    @ResponseBody
    @RequestMapping("/loginByTelno")
    public JsonResult loginByTelno(String telno, HttpServletRequest request){
        System.out.println("customerController-->loginByTelno   "+telno);
        Customer customer = customerService.getByPhone(Long.valueOf(telno));
        System.out.println("loginByTelno"+customer);
        if (customer!= null){
            request.getSession().setAttribute("customerTelno",customer.getCustTelno());
            request.getSession().setAttribute("customerId",customer.getCustId());
            return JsonResult.createSuccessJsonResult(null);
        }else{
            Customer  newcustomer = new Customer();
            newcustomer.setCustTelno(Long.valueOf(telno));
            Boolean flag = customerService.save(newcustomer);
            if (flag){
                customer = customerService.getByPhone(Long.valueOf(telno));
                request.getSession().setAttribute("customerTelno",customer.getCustTelno());
                request.getSession().setAttribute("customerId",customer.getCustId());
                return  JsonResult.createSuccessJsonResult(null);
            }else return JsonResult.createFailJsonResult(null);
        }
    }


/* ========================获取用户电话======================== */
    @ResponseBody
    @RequestMapping("/getLoginTelno")
    public JsonResult getloginTelno(HttpServletRequest request){
        System.out.println("customerController-->getloginTelno   ");
        Object result = request.getSession().getAttribute("customerTelno");
        System.out.println(result);
        if (result != null){
            Long telno = (Long) result;
            System.out.println("customerController-->getloginTelno中的telno为："+telno);
            Map<String,Object> data = new HashMap<>();
            data.put("customerTelno",telno);
            return JsonResult.createSuccessJsonResult(data);
        }else  return JsonResult.createFailJsonResult(null);
    }

/* ========================通过手机号获取用户信息======================== */
    @ResponseBody
    @RequestMapping("/getInfoByTelno")
    public JsonResult getInfoByTelno(Long telno,HttpServletRequest request){
        System.out.println("customerController-->getInfoByTelno   ");
        Customer customer = customerService.getByPhone(telno);
        if (customer != null) {
            Map<String, Object> data = new HashMap<>();
            data.put("customer", customer);
            return JsonResult.createSuccessJsonResult(data);
        }else return JsonResult.createFailJsonResult(null);
    }


/* ========================用户注册======================== */
    @ResponseBody
    @RequestMapping("/regist")
    public JsonResult regist(Customer customer){
        return null;
    }



/* ========================用户退出======================== */
    @RequestMapping("logout")
    @ResponseBody
    public JsonResult Logout(HttpServletRequest request){
        System.out.println("controller-->Logout");
        request.getSession().removeAttribute("customerTelno");
        request.getSession().removeAttribute("customerId");
        request.getSession().invalidate();
        return JsonResult.createSuccessJsonResult(null);
    }




    @RequestMapping("welcomeindex")
    @ResponseBody
    public JsonResult welcomewelcomeindex(HttpServletRequest request){
        HttpSession session = request.getSession();
        String loginCustomerTel = String.valueOf(session.getAttribute("loginCustomerTel"));
        if (loginCustomerTel != null || loginCustomerTel != ""){
            return JsonResult.createSuccessJsonResult(null);
        }
        else return JsonResult.createFailJsonResult(null);

    }

}
