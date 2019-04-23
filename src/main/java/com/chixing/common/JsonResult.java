package com.chixing.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/***
 *统一封装controller层返回的结果
 * 枚举类型
 */
@Setter
@Getter
@ToString
public class JsonResult {
    private ResultStatus status;
    private Map<String,Object> data;
    private String message;

    public JsonResult() {}

    public JsonResult(ResultStatus status, Map<String, Object> data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public static JsonResult createSuccessJsonResult(Map<String,Object> date){
        return new JsonResult(ResultStatus.SUCCESS,date,"操作成功");
    }

    public static JsonResult createFailJsonResult(Map<String,Object> date){
        return new JsonResult(ResultStatus.SUCCESS,date,"操作失败");
    }

    public static JsonResult createErrorJsonResult(Map<String,Object> date){
        return new JsonResult(ResultStatus.SUCCESS,date,"操作错误");
    }

    public static JsonResult needLoginJsonResult(Map<String,Object> date){
        return new JsonResult(ResultStatus.SUCCESS,date,"用户需要先登录");
    }

    public static JsonResult hasLoginJsonResult(Map<String,Object> date){
        return new JsonResult(ResultStatus.SUCCESS,date,"用户已经登录");
    }

}
