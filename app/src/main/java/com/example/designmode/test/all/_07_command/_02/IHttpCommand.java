package com.example.designmode.test.all._07_command._02;

import android.content.Context;

/**
 * 网络请求命令接口
 *
 * 以前采用Map集合传入， 现在面向接口编程
 * Created by Xionghu on 2017/7/4.
 * Desc:
 */

public interface IHttpCommand<T extends IRequestParam> {
    public enum RequestType {
        Default(0), Get(1), Post(2), Delete(3);
        private int type;

        private RequestType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }
    }

    public String execute(Context context, String url, RequestType requestType,
                          T requestParam);
}