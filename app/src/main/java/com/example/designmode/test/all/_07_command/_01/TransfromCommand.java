package com.example.designmode.test.all._07_command._01;

public class TransfromCommand implements ICommand {
    private Receiver receiver;

    public TransfromCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.onTransformation();
    }


}