package com.example.designmode.test.all._07_command._01;

import java.io.Serializable;

public interface ICommand extends Serializable {
    void execute();
}