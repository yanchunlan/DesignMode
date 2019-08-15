package com.example.designmode.test.all._07_command._02;

import android.content.Context;
import android.os.AsyncTask;

import com.example.designmode.test.all._07_command._02.system.SystemHttpCommand;
import com.example.designmode.test.all._07_command._02.system.SystemRequestParam;

public class HttpTask extends AsyncTask<String, Void, String> {

    private HttpTask.Builder.Params p;

    protected HttpTask(HttpTask.Builder.Params p) {
        this.p = p;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected String doInBackground(String... params) {
        try {
            // 执行命令
            return this.p.httpCommand.execute(this.p.context, this.p.url,
                    this.p.requestType, this.p.requestParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        if (this.p.onHttpResultListener != null) {
            this.p.onHttpResultListener.onResult(result);
        }
    }

    public void builder() {
        execute();
    }

    // 采用Builder设计模式
    public static class Builder {

        private Params p;

        public Builder(Context context, String url,
                       HttpUtils.OnHttpResultListener onHttpResultListener) {
            this.p = new Params(context, url, onHttpResultListener);
        }

        public Builder setRequestType(IHttpCommand.RequestType requestType) {
            this.p.requestType = requestType;
            return this;
        }

        public Builder setRequestParam(IRequestParam requestParam) {
            this.p.requestParam = requestParam;
            return this;
        }

        public Builder setHttpCommand(IHttpCommand httpCommand) {
            this.p.httpCommand = httpCommand;
            return this;
        }

        public HttpTask build() {
            return new HttpTask(p);
        }

        public static class Params {
            public Context context;
            public IHttpCommand.RequestType requestType;
            public String url;
            public IRequestParam requestParam;
            public HttpUtils.OnHttpResultListener onHttpResultListener;
            public IHttpCommand httpCommand;

            public Params(Context context, String url,
                          HttpUtils.OnHttpResultListener onHttpResultListener) {
                this.context = context;
                this.url = url;
                this.requestType = IHttpCommand.RequestType.Get;
                this.httpCommand = new SystemHttpCommand();
                this.requestParam = new SystemRequestParam();
                this.onHttpResultListener = onHttpResultListener;
            }
        }

    }

}