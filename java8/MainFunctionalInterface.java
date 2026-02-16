package com.java8;

@FunctionalInterface
interface Add {
    int calculate(int n1, int n2);
//    void calculate(int n1,int n2,int n3);
}

public class MainFunctionalInterface {
    public static void main(String[] args) {
        Add a=new Add() {
            @Override
            public int calculate(int n1, int n2) {
                return 0;
            }

//            @Override
            public void calculate(int n1, int n2, int n3) {

            }
        };
        Add a1=(int n1,int n2)->(n1+n2);
        System.out.println(a1.calculate(20,30));
        System.out.println();
    }
}
