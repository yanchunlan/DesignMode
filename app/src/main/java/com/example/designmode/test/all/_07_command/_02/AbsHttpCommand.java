package com.example.designmode.test.all._07_command._02;

import android.content.Context;

/**
 * author:  ycl
 * date:  2019/08/15 16:46
 * desc:
 */
public abstract class AbsHttpCommand<T extends IRequestParam> implements IHttpCommand<T> {
    @Override
    public String execute(Context context, String url, RequestType requestType, T requestParam) {
        if (requestType == RequestType.Get) {
            return executeGet(context, url, requestParam);
        } else if (requestType == RequestType.Post) {
            return executePost(context, url, requestParam);
        } else if (requestType == RequestType.Default) {
            return executeGet(context, url, requestParam);
        }
        return null;
    }

    public abstract String executePost(Context context, String url, T requestParam);

    public abstract String executeGet(Context context, String url, T requestParam);
}
