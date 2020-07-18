package com.shi.studyboot;

public class ResStat {
    /**
     * 状态码
     */
    private int code;
    /**
     * 信息
     */
    private String msg;

    private String data;

    public ResStat() {
    }

    public ResStat(int code, String msg, String data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResStat build(int i) {
        return new ResStat(200,"ok","data");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
