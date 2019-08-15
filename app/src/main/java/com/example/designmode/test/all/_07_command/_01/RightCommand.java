package com.example.designmode.test.all._07_command._01;

public class RightCommand implements ICommand {
    private Receiver receiver;
    public RightCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        this.receiver.onRight();
    }

}