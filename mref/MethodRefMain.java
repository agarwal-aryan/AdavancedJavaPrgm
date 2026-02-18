package com.mref;

class Calculator{
    Calculator(){
        System.out.println("this is a constructor");

    }
    int sub(int numm1, int num2){
        return numm1-num2;
    }
    static  int mul(int num1,int num2){
        return num1*num2;
    }
}
@FunctionalInterface
interface Cal{
    int mul(int n1,int n2);
}
public class MethodRefMain {
    public static void main(String[] args) {
        Calculator c=new Calculator();
//        int r=c1.sub(100,25);
//        System.out.println("subtraction"+r);
//        Cal c1=c::sub;
//        int s1 =c1.cal(100,20);
//        System.out.println(s1);
//        Cal c3 = Calculator::mul;
//        int m1=c3::mul(100,25);
//        System.out.println(m1);
//        Cal c3=
    }
}
