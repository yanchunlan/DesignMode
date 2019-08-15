package com.example.designmode.test.all._03_template;

public class LoLGame extends Game {
    @Override
    void initialize() {
        System.out.println("初始化LOL游戏");
    }

    @Override
    void startPlay() {
        System.out.println("LOL游戏开始");
    }

    @Override
    void endPlay() {
        System.out.println("LOL游戏结束");
    }
}