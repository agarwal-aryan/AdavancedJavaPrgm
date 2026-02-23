package com.java8;

public class Local_Variable_type_Inference {
    public static void main(String[] args) {
        int a=10;
        var b=10;
        b=11;
//        b="name"; it cannot be done as it is not allowed
        String name=new String("This is a String ");
        var v1=new String("Hello");
        int [] arr={1,2,4};
//        int [] arr2=new int[6];
        for(var v5:arr){
            System.out.println(v5);
        }

    }

}
