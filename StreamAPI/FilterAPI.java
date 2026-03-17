package com.StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class FilterAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(List.of(23,25,64,67,89));


        ArrayList<String> listString =new ArrayList<>();
        listString.addAll(List.of("aryan","alok","arpit"));
//        method 1
        Stream<Integer> listStream =list.stream();
        listStream.forEach((item)-> System.out.println(item));

        Stream<String> listStringStream=listString.stream();
        list.stream().filter((n)->(n>60)).forEach((item2)-> System.out.println(item2));



    }
}
