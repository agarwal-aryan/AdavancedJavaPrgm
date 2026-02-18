package com.java8;

import java.util.Scanner;

@FunctionalInterface
interface Add {
    boolean vote(int age);
//    void calculate(int n1,int n2,int n3);
}

public class MainFunctionalInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Add a=new Add() {
//            @Override
//            public void calculate() {
//                return 0;
//
//            }

//            @Override
//            public void calculate(int n1, int n2, int n3) {
//
//            }
//        };
        Add a1=(int age)->{
            if (age>18){
                return true;
            }
            return false;
        };
        int age=sc.nextInt();
        if(a1.vote(age)){
            System.out.println("Can vote");
        }else {
            System.out.println("Cannote vote");
        }

//        System.out.println();
//        System.out.println();
    }
}
