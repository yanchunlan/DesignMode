package com.example.designmode.test.all._03_template;

public class KingGloryGame extends Game {
    @Override
    void initialize() {
        System.out.println("初始化王者荣耀游戏");
    }

    @Override
    void startPlay() {
        System.out.println("王者荣耀游戏开始");
    }

    @Override
    void endPlay() {
        System.out.println("王者荣耀游戏结束");
    }
}