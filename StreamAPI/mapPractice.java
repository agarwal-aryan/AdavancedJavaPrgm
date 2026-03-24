package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int empID;

    Employee(String name, int empID) {
        this.empID = empID;
        this.name = name;
    }
}

public class mapPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sachin", "rahul", "amit");
        List<String> result = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);

        Employee s1 = new Employee("s1", 89);
        Employee s2 = new Employee("s2", 78);
        Employee s3 = new Employee("s3", 77);
        Employee s4 = new Employee("s4", 56);
        Employee s5 = new Employee("s5", 57);
        List<Employee> employees=Arrays.asList(s1,s2,s3,s4,s5);
    }
}

