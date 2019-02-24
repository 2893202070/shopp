package com.moyu.shopp.utils;

public class AjaxResult {
    private boolean success = true;
    private String smg = "操作成功";
    private Object obj;

    public AjaxResult() {
    }

    public AjaxResult(boolean success, String smg, Object obj) {
        this.success = success;
        this.smg = smg;
        this.obj = obj;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getSmg() {
        return smg;
    }

    public AjaxResult setSmg(String smg) {
        this.smg = smg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public AjaxResult setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", smg='" + smg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
