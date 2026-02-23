package com.java8;

record Student(int sid,String name, String course){ //it is the constructor of the class

};
public class MainTextBlock {
    public static void main(String[] args) {
        Student s=new Student(1,"aryan","mca");
        System.out.println(s.sid());
        System.out.println(s.course());
        System.out.println(s.name());
       System.out.println(s); //it is used to print
    }
}
