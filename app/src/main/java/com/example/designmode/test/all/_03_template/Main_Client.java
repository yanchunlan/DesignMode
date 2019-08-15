package com.example.designmode.test.all._03_template;

public class Main_Client {
    public static void main(String[] args) {
        // AsyncTask类、activity中的onCreate() 等生命周期
        Game game = new LoLGame();
        game.play();

        game = new KingGloryGame();
        game.play();
    }
}