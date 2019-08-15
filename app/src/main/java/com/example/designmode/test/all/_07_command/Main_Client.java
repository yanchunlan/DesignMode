package com.example.designmode.test.all._07_command;

import com.example.designmode.test.all._07_command._02.HttpTask;
import com.example.designmode.test.all._07_command._02.HttpUtils;
import com.example.designmode.test.all._07_command._02.IHttpCommand;
import com.example.designmode.test.all._07_command._02.IRequestParam;
import com.example.designmode.test.all._07_command._02.okhttp.OKHttpCommand;
import com.example.designmode.test.all._07_command._02.okhttp.OKHttpRequestParam;

public class Main_Client {
    public static void main(String[] args) {

        // 01
        /**
         * 接收者
         */
        /*Receiver receiver = new Receiver();

        // 命令对象
        ICommand leftCommand = new LeftCommand(receiver);
        ICommand rightCommand = new RightCommand(receiver);
        ICommand bottomCommand = new BottomCommand(receiver);
        ICommand transfromCommand = new TransfromCommand(receiver);

        Invoker invoker = new Invoker(leftCommand, rightCommand, bottomCommand, transfromCommand);
        invoker.toLeft();
        invoker.toRight();
        invoker.toBottom();
        invoker.toTransfrom();

        //序列化存档
        System.out.println("----存档----");
        invoker.saveArchive();

        invoker.toBottom();

        System.out.println("----读档----");
        //读档
        invoker.loadArchive();*/


        // 02
        //请求者
        /*HttpTask.Builder builder = new HttpTask.Builder(null, "", new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {

            }
        });

        IRequestParam requestParam = new SystemRequestParam();
        requestParam.put("","");
        builder.setRequestParam(requestParam)
                .setRequestType(IHttpCommand.RequestType.Post)
                .build()
                .builder();*/


        //请求者
        HttpTask.Builder builder = new HttpTask.Builder(null, "", new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {

            }
        });
        IRequestParam requestParam = new OKHttpRequestParam();
        requestParam.put("","");
        builder.setRequestParam(requestParam)
                .setHttpCommand(new OKHttpCommand())
                .setRequestType(IHttpCommand.RequestType.Post).build().builder();
    }
}