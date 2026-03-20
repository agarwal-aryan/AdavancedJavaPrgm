package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class mapPractice {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("sachin","rahul","amit");
        List<String> result=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
    }
}
