package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class FilterApiExamples {
    public static void main(String[] args) {
        //question 1
//        ArrayList<Integer> list1=new ArrayList<Integer>();
//        list1.addAll(List.of(10,15,20,25,30,11,17,16));
//
//        list1.stream().filter(n->n%2==0).forEach(item-> System.out.println(item));
// question 2
//        ArrayList<String> listString =new ArrayList<>();
//        listString.addAll(List.of("Amit","Ravi","Anil","Vikas","Ashok","Rahul"));
//
//        listString.stream().filter(n->n.charAt(0)=='A').forEach(item-> System.out.println(item));

//        question 3
//        ArrayList<Integer> list2=new ArrayList<Integer>();
//        list2.addAll(List.of(10,60,45,90,30,24,50,76));
//        list2.stream().filter(n->n>50).forEach(item-> System.out.println(item));

//        question4
//        ArrayList<String> listString2 =new ArrayList<>();
//        listString2.addAll(List.of("Java","Python","C","React","C#","Next.js","Node.js"));
//
//        listString2.stream().filter(n->n.length()>4).forEach(System.out::println);

//      question5

        ArrayList<String> listString3 = new ArrayList<>();
        listString3.addAll(List.of("Java", "null", "Spring", "null", "React"));

        List<String> str = listString3.stream().filter(n -> !n.equals("null")).toList();
        System.out.println(str);


//        question6
//        ArrayList<Integer> list3=new ArrayList<Integer>();
//        list3.addAll(List.of(3,4,7,8,9,1,5,4,16));

//        list3.stream().filter(n->n%2!=0).forEach(item-> System.out.println(item));

    }

}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }
}
//how to filter a list of different class objects
class Main {
    public static void main(String[] args) {
        Student s1 = new Student("s1", 89);
        Student s2 = new Student("s2", 78);
        Student s3 = new Student("s3", 77);
        Student s4 = new Student("s4", 56);
        ArrayList<Student> list3 = new ArrayList<>();
        list3.addAll(List.of(s1, s2, s3, s4));

        list3.stream().filter(n -> n.marks > 60).forEach(item -> System.out.println(item.name));
    }
}

