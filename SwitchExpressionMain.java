package com;

import java.util.Scanner;

public class SwitchExpressionMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

//        this is called switch expression in which it returns value to result
        String result=switch (day){
            case 1 -> "Monday";
            case 2-> {
                System.out.println("Ello");
                yield "Tuesday";
            }
            default -> "No Day";
        };
        System.out.println(result);
    }
}
