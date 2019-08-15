package com.example.designmode.test.all._07_command._02.okhttp;

import android.content.Context;

import com.example.designmode.test.all._07_command._02.AbsHttpCommand;
import com.example.designmode.test.all._07_command._02.HttpUtils;

public class OKHttpCommand extends AbsHttpCommand<OKHttpRequestParam> {
    @Override
    public String executePost(Context context, String url, OKHttpRequestParam requestParam) {
        //发送请求
        try {
            return HttpUtils.post(url, requestParam.getRequestParam());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String executeGet(Context context, String url, OKHttpRequestParam requestParam) {
        try {
            return HttpUtils.get(url,requestParam.getRequestParam());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}