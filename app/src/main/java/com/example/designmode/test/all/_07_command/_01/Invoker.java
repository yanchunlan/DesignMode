package com.example.designmode.test.all._07_command._01;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private ICommand leftCommand;
    private ICommand rightCommand;
    private ICommand bottomCommand;
    private ICommand transfromCommand;
    private List<ICommand> commandList = new ArrayList<>();

    public Invoker() {
    }

    public Invoker(ICommand leftCommand, ICommand rightCommand, ICommand bottomCommand, ICommand transfromCommand) {
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
        this.bottomCommand = bottomCommand;
        this.transfromCommand = transfromCommand;
    }

    public void toLeft() {
        this.leftCommand.execute();
        commandList.add(leftCommand);
    }

    public void toRight() {
        this.rightCommand.execute();
        commandList.add(rightCommand);
    }

    public void toBottom() {
        this.bottomCommand.execute();
        commandList.add(bottomCommand);
    }

    public void toTransfrom() {
        this.transfromCommand.execute();
        commandList.add(transfromCommand);
    }

    /**
     * 回退
     */
    public void fallback() {
        if (commandList.size() > 0) {
            commandList.remove(commandList.size() - 1);
        }
    }

    /**
     * 存档
     */
    public void saveArchive() {
        System.err.println(commandList.toString());
        Utils.serializable("gameOperation", commandList);
    }

    /**
     * 读档
     */
    public void loadArchive() {
        List<ICommand> list = Utils.deserialize("gameOperation");
        System.err.println(list.toString());
        this.commandList.clear();
        this.commandList.addAll(list);
        for (ICommand command : list) {
            command.execute();
        }
    }
}