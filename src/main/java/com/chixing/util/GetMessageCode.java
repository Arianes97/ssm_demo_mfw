package com.chixing.util;


import java.net.URLEncoder;
import com.alibaba.fastjson.JSONObject;
import com.chixing.common.Config;
import com.chixing.common.HttpUtil;

public class GetMessageCode {

        private static String operation = "/industrySMS/sendSMS";//对应的API地址
        private static String accountSid = Config.ACCOUNT_SID;
        //private static String to = "17806282197"; //改由前台传入
        private static String rod=smsCode();   //生成一个随机验证码
        private static String smsContent = "【榛子信信】您的验证码为"+rod+"，请于1分钟内正确输入，如非本人操作，请忽略此短信。";

        //创建验证码
        public static String smsCode(){
            String random=(int)((Math.random()*9+1)*100000)+"";
            System.out.print("random验证码:"+random);
            return random;
        }

        //根据相应的手机号发送验证码
        public static String getCode(String phone){
            String tmpSmsContent = null;
            try{                 //解码
                tmpSmsContent = URLEncoder.encode(smsContent, "UTF-8");
            }catch(Exception e){
                e.getMessage();
            }

            String url = Config.BASE_URL + operation;
            String body = "accountSid=" + accountSid + "&to=" + phone + "&smsContent=" + tmpSmsContent
                    + HttpUtil.createCommonParam();

            // 提交请求 result:状态码
            String result = HttpUtil.post(url, body);

            //(换行符) 剔除了平台无关性，写一次代码跑通在Linux上和Window上都能够运行。
            System.out.println("result:" + System.lineSeparator() + result);
            System.out.println(result.getClass());

            //字符串转json对象
            JSONObject jsonObject = JSONObject.parseObject(result);
            String respCode = jsonObject.getString("respCode");
            System.out.println(respCode);

            //反馈-00000状态码标识请求成功，rod:随机验证码
            String defaultRespCode="00000";
            if(defaultRespCode.equals(respCode)){
                return rod;
            }else{
                return defaultRespCode;
            }
        }



}
