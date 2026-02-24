package com.java8;

import java.util.*;

public class ForEachMethod {
    public static void main(String[] args) {
        int [] data={1,2,3,4,5,6,8,9};
//        array does not have any ForEach method
        List<Integer> listData=Arrays.stream(data).boxed().toList();// used to convert array to stream
        System.out.println(listData);
        listData.forEach((value)-> System.out.println(value));
        listData.forEach(System.out::println);

    }
}
