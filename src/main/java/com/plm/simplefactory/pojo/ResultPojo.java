package com.plm.simplefactory.pojo;

public class ResultPojo {
    private String code;
    private String message;
    private double data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    private static ResultPojo newInstance(String code, String message, double data){
        ResultPojo pojo = new ResultPojo();
        pojo.setCode(code);
        pojo.setMessage(message);
        pojo.setData(data);
        return pojo;
    }

    public static ResultPojo success(double data){
        return newInstance("0", "success", data);
    }

    public static ResultPojo fail(){
        return newInstance("1", "failure", 0.0);
    }

    public String toString(){
        String str = String.format("返回信息：%s，返回结果：%.2f。", message, data);
        return str;
    }
}
