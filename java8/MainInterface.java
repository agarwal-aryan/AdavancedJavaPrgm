package com.java8;

interface Calc {
    void calculate(int n1, int n2);

    default void calculate(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        System.out.println(sum);
    }
    static String getInfo(){
        return "This is static getInfo";
    }
}

class Calculator implements Calc {
    @Override
    public void calculate(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println(sum);
    }
}

public class MainInterface {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.calculate(2, 3);
        c1.calculate(2, 3, 4);
        System.out.println(Calc.getInfo());
    }
}
