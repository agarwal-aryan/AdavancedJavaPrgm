package com.java8;
import java.util.Scanner;
@FunctionalInterface
interface Add1 {
    void vote(int age);
}
class voter{
    void voting1(int newAge){
        if(newAge>30){
            System.out.println("age greater than 30");
        }else {
            System.out.println("age not greater than 30");
        }
    }
}
public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Add a1 = age -> {
//            if (age > 18) {
//                return true;
//            }
//            return false;
//        };

        voter v1=new voter();
        Add1 a2=v1::voting1;
       a2.vote(20);

    }
}
