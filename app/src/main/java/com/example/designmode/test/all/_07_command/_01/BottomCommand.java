package com.example.designmode.test.all._07_command._01;

public class BottomCommand implements ICommand {
    private Receiver receiver;
    public BottomCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        this.receiver.onBottom();
    }
}
