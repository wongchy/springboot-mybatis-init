package com.aus.common.enums;

/**
 * @Author WongChy
 * @Date 2020/10/26 8:51
 */
public enum ResponseEnum {

    SUCCESS_ALL("00000","一切ok"),
    ERROR_USER("A0001","用户端错误"),
    ERROR_SYSTEM("B0001","系统执行出错"),
    ERROR_CALL_THIRD_PARTY("C0001","调用第三方服务出错");

    private String code;

    private String cnSense;

    ResponseEnum(String code,String cnSense){
        this.code = code;
        this.cnSense=cnSense;
    }

    public String getCode() {
        return code;
    }

    public String getCnSense() {
        return cnSense;
    }
}
