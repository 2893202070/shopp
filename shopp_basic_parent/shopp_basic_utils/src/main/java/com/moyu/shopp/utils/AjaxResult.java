package com.moyu.shopp.utils;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AjaxResult {
    private boolean success = true;
    private String msg = "操作成功";
    private Object obj;

    public AjaxResult() {
    }

    public AjaxResult(boolean success, String smg, Object obj) {
        this.success = success;
        this.msg = smg;
        this.obj = obj;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setSmg(String msg) {
        this.msg = msg;
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
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
    Map map = new HashMap<AjaxResult,String>();


}
