package com.example.designmode.test.all._08_explain;

public class Main_Client {
    public static void main(String[] args) {
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(1);

        Context ctx = new Context();
        ctx.assign(x, 2);
        ctx.assign(y, 3);

        Expression exp = new Plus(new Plus(c,x) , new Minus(y,x));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));

    }
}