package com.example.designmode.test.all._03_template;

public abstract class Game {
       abstract void initialize();
       abstract void startPlay();
       abstract void endPlay();

       public final void play(){
           initialize();
           startPlay();
           endPlay();
       }
}