package com.chixing.convertor;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {//页面中接收到的参数值 myBirth
        Date result = null;
       if(source!=null){
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
           try {
               result =  df.parse(source);
           } catch (ParseException e) {
               e.printStackTrace();
           }
       }
        return result;
    }
}
