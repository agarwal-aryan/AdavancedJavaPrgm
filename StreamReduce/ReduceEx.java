package com.StreamReduce;

import java.util.*;
import java.util.stream.IntStream;

public class ReduceEx {
    public static void main(String[] args) {
//        ArrayList<Integer> list1=new ArrayList<Integer>();
//        list1.addAll(List.of(34,12,98,5,78,2));
//       int sum= list1.stream().reduce(Integer.MIN_VALUE,(a,b)->{
//           if(a<b)
//               return b;
//           return a;
//       });
//        System.out.println(sum);
        int ab = 5;
        int fact = IntStream.rangeClosed(1, ab).reduce(1, (a, b) -> a * b);

    }
}
