package com.example.designmode.test.all._07_command._01;

public class LeftCommand implements ICommand {
    private Receiver receiver;
    public LeftCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        /**
         * 执行之前干一些事情
         *  例如 存档
         */
        this.receiver.onLeft();
    }
}